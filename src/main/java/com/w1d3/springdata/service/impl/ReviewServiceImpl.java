package com.w1d3.springdata.service.impl;

import com.w1d3.springdata.entity.Review;
import com.w1d3.springdata.repository.ReviewRepo;
import com.w1d3.springdata.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepo reviewRepo;
    @Override
    public void save(Review review) {
    reviewRepo.save(review);
    }

    @Override
    public List<Review> findAll() {
        return (List<Review>)reviewRepo.findAll() ;
    }

    @Override
    public Review findById(int id) {
        return reviewRepo.findById(id).get();
    }
    @Override
    public void deleteById(int id) {
    reviewRepo.deleteById(id);
    }

    @Override
    public List<Review> reviewsByProductId(int id) {
        return reviewRepo.findReviewByProduct_Id(id);
    }
}
