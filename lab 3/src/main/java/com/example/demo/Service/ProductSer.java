package com.example.demo.Service;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.Product;
import com.example.demo.Entity.Review;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface ProductSer {
    void add(Product product);
    void delete(Long id);
    Product getById(Long id);

    List<Product> findAllByPriceGreaterThan(Long minPrice);
    List<Product> findAllByNameContaining(String name);
    List<Review> findReviewByProductId(Long id);
    List<Product> getAll();
}
