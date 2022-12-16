package com.SpringData1.Lab3.service;

import com.SpringData1.Lab3.entity.UniDirectional.Review;

import java.util.List;

public interface ReviewService {
    void save (Review review);

    Review get(Long id);

    List<Review> getAll();

    void saveorUpdate(Review review);

    void delete(Long id);
}
