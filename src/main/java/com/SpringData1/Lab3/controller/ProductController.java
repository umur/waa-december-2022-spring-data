package com.SpringData1.Lab3.controller;

import com.SpringData1.Lab3.entity.UniDirectional.Product;
import com.SpringData1.Lab3.entity.UniDirectional.Review;
import com.SpringData1.Lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    public final ProductService productService;

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return productService.get(id);
    }

    @GetMapping
    public List<Product> GetAll() {
        return productService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Product product) {
        productService.saveOrUpdate(product);
    }

    @PutMapping
    public void update(@RequestBody Product product) {
        productService.saveOrUpdate(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }

    @GetMapping("/filterByMinPrice")
    public List<Product>  findProductGreaterThanMinPrice(@RequestParam Double minPrice)
    {
        return  productService.findAllProductGreaterThan(minPrice);
    }

    @GetMapping("/filterByName")
    public List<Product>  findByName(@RequestParam String name)
    {
        return  productService.findByName(name);
    }

    @GetMapping("/filterReviewById")
    public List<Review> findReviewById(@RequestParam Long id)
    {
        return  productService.findReviewById(id);
    }

}