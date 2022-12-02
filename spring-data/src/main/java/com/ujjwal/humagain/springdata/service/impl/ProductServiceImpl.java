package com.ujjwal.humagain.springdata.service.impl;

import com.ujjwal.humagain.springdata.entity.Product;
import com.ujjwal.humagain.springdata.entity.Review;
import com.ujjwal.humagain.springdata.entity.dto.ProductDto;
import com.ujjwal.humagain.springdata.entity.dto.ReviewDto;
import com.ujjwal.humagain.springdata.repository.ProductRepository;
import com.ujjwal.humagain.springdata.repository.ReviewRepository;
import com.ujjwal.humagain.springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ReviewRepository reviewRepository;
    private final ModelMapper modelMapper;
    @Override
    public void save(ProductDto productDto) {
        Product product = modelMapper.map(productDto,Product.class);
        productRepository.save(product);
    }

    @Override
    public void update(int id, ProductDto productDto) {
        Product product = productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setRating(productDto.getRating());
        productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        Product product = productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
        productRepository.delete(product);
    }

    @Override
    public List<ProductDto> findAll() {
//        List<ProductDto> products = new ArrayList<>();
//        List<Product> productList = productRepository.findAll();
//        for (Product product:productList){
//            products.add(modelMapper.map(product,ProductDto.class));
//        }
//        return products;
        return productRepository.findAll().stream().map(product -> modelMapper.map(product, ProductDto.class)).toList();
    }

    @Override
    public ProductDto findById(int id) {
        return productRepository.findById(id).map(product -> modelMapper.map(product,ProductDto.class)).get();
    }

    @Override
    public List<Product> findAllByNameContaining(String keyword) {
        return productRepository.findAllByNameContaining(keyword);
    }

    @Override
    public List<Product> findAllByPriceGreaterThan(int minPrice) {
        return productRepository.findAllByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findAllByCategory_NameAndPriceLessThan(String name, int maxPrice) {
        return productRepository.findAllByCategory_NameAndPriceLessThan(name, maxPrice);
    }

    @Override
    public List<Review> findAllByProductId(int id) {
        return reviewRepository.findAllByProductId(id);
    }
}
