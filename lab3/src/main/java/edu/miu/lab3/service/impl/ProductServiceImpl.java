package edu.miu.lab3.service.impl;

import edu.miu.lab3.dto.CategoryDto;
import edu.miu.lab3.dto.ProductDto;
import edu.miu.lab3.dto.ReviewDto;
import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Product;
import edu.miu.lab3.entity.Review;
import edu.miu.lab3.repository.CategoryRepo;
import edu.miu.lab3.repository.ProductRepo;
import edu.miu.lab3.repository.ReviewRepo;
import edu.miu.lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public final ModelMapper modelMapper;

    @Override
    public ProductDto create(ProductDto productDto) {
        return modelMapper.map(productRepo.save(modelMapper.map(productDto, Product.class)), ProductDto.class);
    }

    @Override
    public ProductDto update(int productId, ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        product = productRepo.save(product);
        return modelMapper.map(product, ProductDto.class);
    }

    @Override
    public void delete(int productId) {
        Product product = productRepo.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        productRepo.delete(product);
    }

    ///////////////////////// GET Methods /////////////////////////

    @Override
    public List<ProductDto> getAll() {
        return productRepo.findAll().stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .toList();
    }

    @Override
    public ProductDto getById(int productId) {
        return modelMapper.map(productRepo.findById(productId).orElseThrow(() -> new RuntimeException("Product not found")), ProductDto.class);
    }

    @Override
    public List<ProductDto> findAllByPriceGreaterThan(double minPrice) {
        var products = productRepo.findAllByPriceGreaterThan(minPrice);

        return products.stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .toList();
    }

    @Override
    public List<ProductDto> findAllByNameContaining(String name) {
        var products = productRepo.findAllByNameContaining(name);

        return products.stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .toList();
    }

    @Override
    public List<ReviewDto> findReviewsOfProduct(int id) {
        var reviews = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found")).getReviews();

        return reviews.stream()
                .map(r -> modelMapper.map(r, ReviewDto.class)).toList();
    }

}
