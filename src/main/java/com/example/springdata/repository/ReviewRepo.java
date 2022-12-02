package com.example.springdata.repository;

import com.example.springdata.entity.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepo extends CrudRepository<Review, Integer> {
}
