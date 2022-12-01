package miu.edu.springdata.service;

import miu.edu.springdata.entity.Review;

import java.util.List;

public interface ReviewService {
    void save(Review review);
    List<Review> findAll();
    Review findById(int id);
    void deleteById(int id);
}
