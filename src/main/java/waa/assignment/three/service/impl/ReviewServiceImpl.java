package waa.assignment.three.service.impl;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import waa.assignment.three.dto.ReviewDto;
import waa.assignment.three.entity.Product;
import waa.assignment.three.entity.Review;
import waa.assignment.three.repository.ReviewRepository;
import waa.assignment.three.service.ReviewService;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
@Transactional
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final ModelMapper modelMapper;

    public void saveReview(ReviewDto review) {
        reviewRepository.save(modelMapper.map(review, Review.class));

    }

    public List<ReviewDto> getReviews() {
        return StreamSupport.stream(reviewRepository.findAll().spliterator(), false).map(review -> modelMapper.map(review, ReviewDto.class)).toList();
    }

    public ReviewDto getReview(long id) {
        return modelMapper.map(reviewRepository.findById(id).get(), ReviewDto.class);
    }

    public void deleteReview(long id) {
        reviewRepository.deleteById(id);
    }

    public void updateReview(long id, ReviewDto review) {
        Review review1 = reviewRepository.findById(id).get();
        review1.setComment(review.getComment());
        review1.setProduct(modelMapper.map(review.getProductDto(), Product.class));
        reviewRepository.save(review1);

    }

    @Override
    public List<ReviewDto> getReviewsByProductId(long productId) {
        return StreamSupport.stream(reviewRepository.findAllByProductId(productId).spliterator(), false).
                map(review -> modelMapper.map(review, ReviewDto.class)).toList();
    }
}
