package com.example.springdata.service.impl;

import com.example.springdata.entity.Review;
import com.example.springdata.repository.ReviewRepository;
import com.example.springdata.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    public final ReviewRepository reviewRepo;
    @Override
    public void save(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public List<Review> getAllReview() {
        return (List<Review>) reviewRepo.findAll();
    }
}
