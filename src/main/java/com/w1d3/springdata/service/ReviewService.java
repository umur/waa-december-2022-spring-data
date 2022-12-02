package com.w1d3.springdata.service;

import com.w1d3.springdata.entity.Review;

import java.util.List;

public interface ReviewService {
    void save(Review review);
    List<Review> findAll();
    Review findById(int id);
    void deleteById(int id);
}
