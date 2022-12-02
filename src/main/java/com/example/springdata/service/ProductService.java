package com.example.springdata.service;

import com.example.springdata.dto.ProductDto;
import com.example.springdata.dto.ReviewDto;
import com.example.springdata.entity.Product;

public interface ProductService {
    Iterable<ProductDto> getAll();
    ProductDto getById(int id);
    void save(ProductDto product);
    void update(int id, ProductDto product);
    void delete(int id);

    Iterable<ReviewDto> getReviewsById(int id);

    Iterable<ProductDto> findAllByPriceGreaterThan(double minPrice);

    Iterable<ProductDto> findAllByCategoryAndPriceLessThan(String cat, double maxPrice);

    Iterable<ProductDto> findAllByNameContainingIgnoreCase(String name);
}

