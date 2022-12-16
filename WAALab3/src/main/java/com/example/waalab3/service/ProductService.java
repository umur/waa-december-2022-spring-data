package com.example.waalab3.service;

import com.example.waalab3.model.Product;

import java.util.List;
import java.util.Optional;


public interface ProductService {

    Product save(Product product);

    List<Product> findAll();

    public void delete(Integer id);

     Optional<Product> get(Integer id);

}
