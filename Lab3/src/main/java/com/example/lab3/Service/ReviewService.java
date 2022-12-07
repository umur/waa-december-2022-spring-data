package com.example.lab3.Service;

import com.example.lab3.Entity.Review;

import java.util.List;

public interface ReviewService {
    public void saveorUpdate(Review review);
    public List<Review> getAll();
    public Review get(int id);
    public void delete(int id);



}
