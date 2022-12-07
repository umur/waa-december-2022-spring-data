package miu.edu.contoller;


import miu.edu.entity.Review;
import miu.edu.service.impl.ReviewServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/reviews")
@RestController
public class ReviewController {
    private final ReviewServiceImpl reviewService;

    public ReviewController(ReviewServiceImpl reviewService){
        this.reviewService= reviewService;
    }

    @GetMapping
    public List<Review> getAll(){
        return  reviewService.getAll();
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
    public void create (@RequestBody Review review){
       reviewService.save(review);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        reviewService.delete(id);
        return "deleted";
    }


}
