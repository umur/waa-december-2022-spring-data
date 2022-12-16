package com.example.waalab3.controller;

import com.example.waalab3.model.Review;
import com.example.waalab3.service.impl.ReviewServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {

    public final ReviewServiceImpl reviewService;

    @PostMapping("/add")
    public void save(@RequestBody Review review){
        reviewService.save(review);
    }

    @GetMapping
    public List<Review> getAll(){
       return reviewService.findAll();
    }
}
