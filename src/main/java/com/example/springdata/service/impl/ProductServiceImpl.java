package com.example.springdata.service.impl;

import com.example.springdata.dto.ProductDto;
import com.example.springdata.dto.ReviewDto;
import com.example.springdata.entity.Category;
import com.example.springdata.entity.Product;
import com.example.springdata.repository.CategoryRepo;
import com.example.springdata.repository.ProductRepo;
import com.example.springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final CategoryRepo categoryRepo;
    private final ModelMapper modelMapper;
    @Override
    public Iterable<ProductDto> getAll() {
        return convertIteratorToList(productRepo.findAll());
    }

    @Override
    public ProductDto getById(int id) {
        return modelMapper.map(productRepo.findById(id).get(), ProductDto.class);
    }

    @Override
    public void save(ProductDto product) {
        productRepo.save(modelMapper.map(product, Product.class));
    }

    @Override
    public void update(int id, ProductDto product) {
        productRepo.save(modelMapper.map(product, Product.class));
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public Iterable<ReviewDto> getReviewsById(int id) {
        return getById(id).getReviews().stream()
                .map(review -> modelMapper.map(review, ReviewDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<ProductDto> findAllByPriceGreaterThan(double minPrice) {
        return convertIteratorToList(productRepo.findAllByPriceGreaterThan(minPrice));
    }

    @Override
    public Iterable<ProductDto> findAllByCategoryAndPriceLessThan(String cat, double maxPrice) {
        Category category = categoryRepo.findByName(cat);
        return convertIteratorToList(productRepo.findAllByCategoryAndPriceLessThan(category, maxPrice));
    }

    @Override
    public Iterable<ProductDto> findAllByNameContainingIgnoreCase(String name) {
        return convertIteratorToList(productRepo.findAllByNameContainingIgnoreCase(name));
    }

    private List<ProductDto> convertIteratorToList(Iterable<Product> iterable){
        List<ProductDto> list = new ArrayList<>();
        iterable.forEach(e -> list.add(modelMapper.map(e, ProductDto.class)));
        return list;
    }

//    private <T, U> List<T> convertIteratorToList(Iterable<U> iterable){
//        List<T> list = new ArrayList<T>();
//        iterable.forEach(e -> list.add(modelMapper.map(e, T)));
//        return list;
//    }
}
