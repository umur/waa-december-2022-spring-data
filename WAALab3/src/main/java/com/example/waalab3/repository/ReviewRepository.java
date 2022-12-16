package com.example.waalab3.repository;

import com.example.waalab3.model.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review,Integer> {
    Review save(Review review);
}
