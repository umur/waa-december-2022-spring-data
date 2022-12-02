package com.w1d3.springdata.service;

import com.w1d3.springdata.entity.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    List<Product> findAll();
    Product findById(int id);
    void deleteById(int id);
}
