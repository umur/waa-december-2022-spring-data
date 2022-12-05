package edu.miu.springdatalab.controller;

import edu.miu.springdatalab.dto.ReviewDto;
import edu.miu.springdatalab.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ankhbayar Azzaya
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping
    public List<ReviewDto> findAll() {
        return reviewService.findAll();
    }

    @GetMapping("/{id}")
    public ReviewDto findById(@PathVariable int id) {
        return reviewService.findById(id);
    }

    @GetMapping("/findAllReviewsByProductId")
    public List<ReviewDto> findAllReviewsByProductId(@RequestParam int productId) {
        return reviewService.findReviewsByProductId(productId);
    }

    @PostMapping
    public void create(@RequestBody ReviewDto reviewDto) {
        reviewService.save(reviewDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody ReviewDto reviewDto) {
        reviewService.save(reviewDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        reviewService.delete(id);
    }

}
