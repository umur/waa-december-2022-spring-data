package com.example.lab3springdata.services.impl;

import com.example.lab3springdata.entity.Review;
import com.example.lab3springdata.repository.ReviewRepo;
import com.example.lab3springdata.services.ReviewService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepo reviewRepo;

    public ReviewServiceImpl(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public Review getById(int id) {
        Review review= reviewRepo.findById(id).get();
        return review;
    }

    @Override
    public List<Review> getAll() {
        List<Review> list = (List<Review>) reviewRepo.findAll();
        return list;
    }

    @Override
    public void save(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public void update(int id, Review review) {
        Review oldReview = reviewRepo.findById(id).get();
        reviewRepo.delete(oldReview);
        review.setId(id);
        reviewRepo.save(review);
    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }
}
