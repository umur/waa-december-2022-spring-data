package com.example.lab3.Service;

import com.example.lab3.Entity.Product;
import com.example.lab3.Entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    public Product save(Product product);
    public void delete(int id);
    public Product get(int id);
    public List<Product> getAll();

    List<Product> findProductGreaterThanMinPrice(Double minPrice);
    List<Product> findByName(String name);
    List<Review> findReviewById(int id);

}