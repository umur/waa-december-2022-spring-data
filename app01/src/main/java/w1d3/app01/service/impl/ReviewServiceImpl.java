package w1d3.app01.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import w1d3.app01.dto.CategoryDto;
import w1d3.app01.dto.ReviewDto;
import w1d3.app01.entity.Review;
import w1d3.app01.repository.ReviewRepo;
import w1d3.app01.service.ReviewService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ModelMapper mapper;
    private final ReviewRepo repo;
    @Override
    public ReviewDto save(ReviewDto r) {
        var review = repo.save(mapper.map(r, Review.class));
        return mapper.map(review, ReviewDto.class);
    }

    @Override
    public List<ReviewDto> getAllReview() {
        var review = repo.findAll();
        List<ReviewDto> l = new ArrayList<>();
        review.forEach(r -> l.add(mapper.map(r, ReviewDto.class)));

        return l;
    }

    @Override
    public ReviewDto getById(int id) {
        var review = repo.findById(id).get();
        return mapper.map(review, ReviewDto.class);
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }

    @Override
    public ReviewDto update(ReviewDto r) {
        delete(r.getId());
        return save(r);
    }

    @Override
    public List<ReviewDto> getReviewByProduct(int prodId) {
        var reviews = repo.findReviewsByProductId(prodId);
        List<ReviewDto> l = new ArrayList<>();
        reviews.forEach(r -> l.add(mapper.map(r, ReviewDto.class)));

        return l;
    }
}
