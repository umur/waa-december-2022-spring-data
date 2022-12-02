package com.example.springdata.repository;

import com.example.springdata.entity.Category;
import com.example.springdata.entity.Product;
import com.example.springdata.entity.Review;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Integer> {
    //Find all products that cost more than minPrice
    Iterable<Product> findAllByPriceGreaterThan(double minPrice);

    //Find all products in cat category and cost less than maxPrice
    Iterable<Product> findAllByCategoryAndPriceLessThan(Category category, double price);

    //Find all products that contain keyword in the name
    Iterable<Product> findAllByNameContainingIgnoreCase(String name);

}
