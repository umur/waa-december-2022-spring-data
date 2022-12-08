package com.example.demo.repository;

import com.example.demo.Entity.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepo extends CrudRepository<Review,Long> {
    List<Review> findReviewByProductId(int id);
}
