package com.example.springdata.service;

import com.example.springdata.entity.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    List<Product> getAllProduct();
}
