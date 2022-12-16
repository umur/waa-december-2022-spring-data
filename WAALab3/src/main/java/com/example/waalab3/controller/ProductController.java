package com.example.waalab3.controller;


import com.example.waalab3.model.Product;
import com.example.waalab3.model.Review;
import com.example.waalab3.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    public  final  ProductServiceImpl productService;
    @PostMapping
    public void addProduct(@RequestBody Product product){
        System.out.println("I am inside controller");
        productService.save(product);
        //return 1;
    }
    @GetMapping
    public List<Product> getAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return productService.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        productService.delete(id);
    }



}
