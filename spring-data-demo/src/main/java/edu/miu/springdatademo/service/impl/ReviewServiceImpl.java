package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.Dto.ReviewDto;
import edu.miu.springdatademo.Repository.ReviewRepo;
import edu.miu.springdatademo.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

import edu.miu.springdatademo.entity.Review;

import org.modelmapper.ModelMapper;


@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepo reviewRepo;
    private final ModelMapper modelMapper;

//    @Override
//    public List<ReviewDto> findAll() {
//        return reviewRepo.findAll().stream().map(a -> modelMapper.map(a, ReviewDto.class)).toList();
//    }

    @Override
    public ReviewDto findById(int id) {
        return reviewRepo.findById(id).map(a -> modelMapper.map(a, ReviewDto.class)).get();
    }

    @Override
    public void save(ReviewDto reviewDto) {
        Review review = modelMapper.map(reviewDto, Review.class);
        reviewRepo.save(review);
    }

    @Override
    public void update(int id, ReviewDto reviewDto) {
        reviewRepo.findById(id).orElseThrow(() -> new RuntimeException("Review not found."));
        Review review = modelMapper.map(reviewDto, Review.class);
        reviewRepo.save(review);
    }

    @Override
    public void delete(int id) {
        Review review = reviewRepo.findById(id).orElseThrow(() -> new RuntimeException("Review not found."));
        reviewRepo.delete(review);
    }
}
