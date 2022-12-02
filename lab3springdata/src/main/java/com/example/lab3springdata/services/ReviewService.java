package com.example.lab3springdata.services;



import com.example.lab3springdata.entity.Review;

import java.util.List;

public interface ReviewService {
    Review getById(int id);
    List<Review> getAll();
    void save(Review review);
    void update(int id, Review review);
    void delete(int id);

}
