package com.example.springdata.repository;

import com.example.springdata.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review,Integer> {
}
