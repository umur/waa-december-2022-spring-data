package edu.miu.lab3.service;

import edu.miu.lab3.dto.ProductDto;
import edu.miu.lab3.dto.ReviewDto;
import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Product;
import edu.miu.lab3.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    ProductDto create(ProductDto productDto);

    ProductDto update(int productId, ProductDto productDto);

    void delete(int productId);

    ///////////////////////// GET Methods /////////////////////////

    ProductDto getById(int productId);

    List<ProductDto> getAll();

    List<ProductDto> findAllByPriceGreaterThan(double minPrice);

    List<ProductDto> findAllByNameContaining(String name);

    List<ReviewDto> findReviewsOfProduct(int id);
}
