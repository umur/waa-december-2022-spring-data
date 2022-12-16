package edu.miu.springdatademo.service;

import edu.miu.springdatademo.dto.ProductDto;
import edu.miu.springdatademo.dto.ReviewDto;
import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.entity.Review;

import java.util.List;

public interface ProductService {

    void save(Product product);
    public List<ProductDto> getAll();
    public List<Product> findAll();

    public List<ProductDto> findFilterByPriceLess(int price);

    public List<ProductDto> findAllByCategoryNameAndPriceLess(String catName, int price);

    public List<ProductDto> findAllByNameContaining(String subname);

    public List<ReviewDto> findProductByIdReviews(int id);
}
