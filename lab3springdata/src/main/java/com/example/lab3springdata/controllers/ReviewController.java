package com.example.lab3springdata.controllers;

import com.example.lab3springdata.entity.Review;
import com.example.lab3springdata.services.impl.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/reviews")
@RestController
public class ReviewController {
    private final ReviewServiceImpl reviewService;

    public ReviewController(ReviewServiceImpl reviewService) {

        this.reviewService = reviewService;
    }

    @GetMapping
    public List<Review> getAll(){

        return reviewService.getAll();
    }
    @GetMapping("/{id}")
    public Review getById(@PathVariable int id){
        return reviewService.getById(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Review review){
        reviewService.update(id,review);
    }
    @PostMapping
    public void create(@RequestBody Review review){
        reviewService.save(review);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        reviewService.delete(id);
        return "deleted";
    }



}
