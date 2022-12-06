package edu.miu.lab3.controller;

import edu.miu.lab3.dto.ReviewDto;
import edu.miu.lab3.entity.Review;
import edu.miu.lab3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/lab3/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    public String create(@RequestBody ReviewDto reviewDto) {
        try {
            reviewService.create(reviewDto);

            return "Review saved successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while saving Review.";
        }
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody ReviewDto reviewDto) {
        try {
            reviewService.update(id, reviewDto);

            return "Review updated successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while updating Review.";
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        try {
            reviewService.delete(id);

            return "Review deleted successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while deleting Review.";
        }
    }

    ///////////////////////// GET Methods /////////////////////////

    @GetMapping
    public List<ReviewDto> getAll() {
        return reviewService.getAll();
    }

    @GetMapping("/{id}")
    public ReviewDto getById(@PathVariable int id) {
        return reviewService.getById(id);
    }

}
