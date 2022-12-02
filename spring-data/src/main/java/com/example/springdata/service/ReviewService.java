package com.example.springdata.service;

import com.example.springdata.entity.Review;

import java.util.List;

public interface ReviewService {

    void save(Review review);

    List<Review> getAllReview();
}
