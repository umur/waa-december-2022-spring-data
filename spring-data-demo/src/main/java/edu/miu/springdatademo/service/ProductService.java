package edu.miu.springdatademo.service;

import edu.miu.springdatademo.Dto.ProductDto;
import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.entity.Review;

import java.util.List;

public interface ProductService {
//    List<ProductDto> findAll();
    ProductDto findById(int id);
    void save(ProductDto productDto);
    void update(int id, ProductDto productDto);
    void delete(int id);
    List<Product> findAllByPriceGreaterThan(double price);
    List<Product> findAllByCategoryAndPriceLessThan(String cat, double price);
    List<Product> findAllByNameContainingIgnoreCase(String keyword);
    List<Review> findReviewsByProductId(int id);
}
