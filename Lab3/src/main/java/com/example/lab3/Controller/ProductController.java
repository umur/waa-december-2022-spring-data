package com.example.lab3.Controller;

import com.example.lab3.Entity.Product;
import com.example.lab3.Entity.Review;
import com.example.lab3.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {
    @Autowired
    private  ProductService prod;
    @PostMapping()
    public Product addProduct(@RequestBody Product product) {

        return prod.save(product);
    }
        @GetMapping("/{id}")
        public Product getProduct(@PathVariable int id){
            return prod.get(id);
        }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        prod.delete(id);
    }
    @GetMapping("/{id}/filterByPriceGreater")
    public List <Product> getByfilter(@RequestParam double price){
        return prod.findProductGreaterThanMinPrice(price);
    }

    @GetMapping("/{id}/filterByName")
    public List <Product> getByfilter(@RequestParam String name){
        return prod.findByName(name);
    }
    @GetMapping("/{id}/reviews")
    public List <Review> getReviews(@RequestParam int value){
        return prod.findReviewById (value);
    }


    }


