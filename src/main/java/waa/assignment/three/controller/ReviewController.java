package waa.assignment.three.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import waa.assignment.three.dto.ReviewDto;
import waa.assignment.three.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;


    @PostMapping
    public void saveReview(@RequestBody ReviewDto reviewDto) {
        reviewService.saveReview(reviewDto);
    }

    @PutMapping("{id}")
    public void updateReview(@PathVariable long id, @RequestBody ReviewDto reviewDto) {
        reviewService.updateReview(id, reviewDto);
    }

    @DeleteMapping("{id}")
    public void deleteReview(@PathVariable long id) {
        reviewService.deleteReview(id);
    }

    @GetMapping("{id}")
    public ReviewDto getReview(@PathVariable long id) {
        return reviewService.getReview(id);
    }

    @GetMapping
    public List<ReviewDto> getReviews() {
        return reviewService.getReviews();
    }

    @GetMapping("/product/{id}")
    public List<ReviewDto> getReviewsByProductId(@PathVariable long id) {
        return reviewService.getReviewsByProductId(id);
    }
}
