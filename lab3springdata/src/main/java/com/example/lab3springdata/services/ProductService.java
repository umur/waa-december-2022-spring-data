package com.example.lab3springdata.services;



import com.example.lab3springdata.entity.Product;

import java.util.List;

public interface ProductService {
    Product getById(int id);
    List<Product> getAll();
    void save(Product product);
    void update(int id, Product product);
    void delete(int id);

}
