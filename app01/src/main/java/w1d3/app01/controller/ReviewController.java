package w1d3.app01.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import w1d3.app01.dto.ReviewDto;
import w1d3.app01.repository.ReviewRepo;
import w1d3.app01.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;
    private final ReviewRepo repo;

    @GetMapping
    public List<ReviewDto> getAll(){
        System.out.printf("getAll %n");

        return reviewService.getAllReview();
    }

    @GetMapping("/{id}")
    public ReviewDto getOne(@PathVariable int id){
        System.out.printf("getOne %s%n", id);
        return reviewService.getById(id);
    }

    @GetMapping("/filterByProductId")
    public List<ReviewDto> getByProductId(@RequestParam int productId){
        System.out.printf("getAll %n");

        return reviewService.getReviewByProduct(productId);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable int id){
        System.out.printf("deleteOne %s%n", id);

        reviewService.delete(id);
    }

    @PutMapping("/{id}")
    public ReviewDto updateOne(@RequestBody ReviewDto p){
        System.out.printf("update %s%n", p);

        return reviewService.update(p);
    }


}
