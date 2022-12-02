package com.example.springdata.controller;

import com.example.springdata.entity.Product;
import com.example.springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    public final ProductService service;
    @GetMapping
    public List<Product> getAll(){
        return service.getAllProduct();
    }

    @PostMapping
    public void saveProduct(@RequestBody Product product){
        service.save(product);
    }
}
