package com.example.waalab3.service;

import com.example.waalab3.model.Review;

import java.util.List;

public interface ReviewService {
    Review save(Review review);

    List<Review> findAll();
}
