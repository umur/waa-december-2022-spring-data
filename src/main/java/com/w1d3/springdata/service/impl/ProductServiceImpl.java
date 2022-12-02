package com.w1d3.springdata.service.impl;

import com.w1d3.springdata.entity.Product;
import com.w1d3.springdata.repository.ProductRepo;
import com.w1d3.springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    @Override
    public void save(Product product) {
    productRepo.save(product);
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>)productRepo.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        productRepo.deleteById(id);

    }

    public List<Product> findProductsMoreThanMinPrice(double minPrice){
       return productRepo.findByPriceGreaterThan(minPrice);
    }

    public List<Product> findByCategoryAnAndPriceLessThan(String cat, double maxPrice){
        return productRepo.findByCategory_NameIgnoreCaseAndPriceLessThan(cat,maxPrice);
    }

    @Override
    public List<Product> findByNameContains(String keyword) {
        return productRepo.findByNameContainsIgnoreCase(keyword);
    }
}
