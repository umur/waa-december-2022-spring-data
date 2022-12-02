package com.example.springdata.controller;

import com.example.springdata.dto.ReviewDto;
import com.example.springdata.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/reviews")
@RestController
public class ReviewController {

    public final ReviewService reviewService;

    @GetMapping
    public Iterable<ReviewDto> getAll(){
        return reviewService.getAll();
    }

    @GetMapping("/{id}")
    public ReviewDto getById(@PathVariable int id){
        System.out.println("Get request received for id: " + String.valueOf(id));
        return reviewService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody ReviewDto review){
        System.out.println("Post request received: " + review.toString());
        reviewService.save(review);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody ReviewDto review){
        System.out.println("Update request received for id: " + String.valueOf(id) + " with request body: " + review.toString());
        reviewService.update(id, review);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        System.out.println("Delete request received for id: " + String.valueOf(id));
        reviewService.delete(id);
    }
}
