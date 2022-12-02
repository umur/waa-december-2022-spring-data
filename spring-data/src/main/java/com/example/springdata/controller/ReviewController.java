package com.example.springdata.controller;
import com.example.springdata.entity.Category;
import com.example.springdata.entity.Review;
import com.example.springdata.service.CategoryService;
import com.example.springdata.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/v1/reviews")
@RequiredArgsConstructor
public class ReviewController {

    public final ReviewService service;
    @GetMapping
    public List<Review> getAllReview(){
        return service.getAllReview();
    }
    @PostMapping
    public void saveReview(@RequestBody Review review){
        service.save(review);
    }
}



