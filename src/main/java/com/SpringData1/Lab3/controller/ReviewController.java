package com.SpringData1.Lab3.controller;


import com.SpringData1.Lab3.entity.UniDirectional.Review;
import com.SpringData1.Lab3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/review")
public class ReviewController {

    public final ReviewService reviewService;

    @GetMapping("/{id}")
    public Review getById(@PathVariable Long id) {
        return reviewService.get(id);
    }

    @GetMapping
    public List<Review> GetAll() {
        return reviewService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Review review) {
        reviewService.saveorUpdate(review);
    }

    @PutMapping
    public void update(@RequestBody Review review) {
        reviewService.saveorUpdate(review);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        reviewService.delete(id);
    }

}