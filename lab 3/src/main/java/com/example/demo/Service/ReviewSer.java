package com.example.demo.Service;


import com.example.demo.Entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewSer {
    void Review(Review product);
    void delete(Long id);
    Review getById(Long id);
    List<Review> getAll(Long id);
}
