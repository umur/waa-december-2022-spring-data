package com.SpringData1.Lab3.service;

import com.SpringData1.Lab3.entity.UniDirectional.Product;
import com.SpringData1.Lab3.entity.UniDirectional.Review;

import java.util.List;

public interface ProductService {

    void save (Product product);

    Product get(Integer id);

    List<Product> getAll();

    void saveOrUpdate(Product product);

    void delete(int id);

    List<Product> findAllProductGreaterThan(Double minPrice);

    List<Product> findByName(String name);

    List<Review> findReviewById(Long id);
}
