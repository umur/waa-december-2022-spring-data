package com.example.springdata.controller;

import com.example.springdata.dto.ProductDto;
import com.example.springdata.dto.ReviewDto;
import com.example.springdata.entity.Product;
import com.example.springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/products")
@RestController
public class ProductController {

    public final ProductService productService;

    @GetMapping
    public Iterable<ProductDto> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable int id){
        System.out.println("Get request received for id: " + String.valueOf(id));
        return productService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody ProductDto product){
        System.out.println("Post request received: " + product.toString());
        productService.save(product);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody ProductDto product){
        System.out.println("Update request received for id: " + String.valueOf(id) + " with request body: " + product.toString());
        productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        System.out.println("Delete request received for id: " + String.valueOf(id));
        productService.delete(id);
    }

    @GetMapping("/{id}/reviews")
    public Iterable<ReviewDto> getReviewsById(@PathVariable int id){
        System.out.println("Get Reviews request received for id: " + String.valueOf(id));
        return productService.getReviewsById(id);
    }

    @GetMapping("/filterByMinPrice")
    public Iterable<ProductDto> filterByMinPrice(@RequestParam double minPrice){
        System.out.println("Get request received for min price: " + String.valueOf(minPrice));
        return productService.findAllByPriceGreaterThan(minPrice);
    }

    @GetMapping("/filterByCatAndMaxPrice")
    public Iterable<ProductDto> filterByCatAndMaxPrice(@RequestParam String cat, double maxPrice){
        System.out.println("Get request received for category: " + cat + " min price: " + String.valueOf(maxPrice));
        return productService.findAllByCategoryAndPriceLessThan(cat, maxPrice);
    }

    @GetMapping("/filterByKeyword")
    public Iterable<ProductDto> filterByKeyword(@RequestParam String name){
        System.out.println("Get request received for filter by keyword: " + String.valueOf(name));
        return productService.findAllByNameContainingIgnoreCase(name);
    }
}
