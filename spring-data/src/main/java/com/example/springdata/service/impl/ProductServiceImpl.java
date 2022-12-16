package com.example.springdata.service.impl;

import com.example.springdata.entity.Product;
import com.example.springdata.repository.ProductRepository;
import com.example.springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    public final ProductRepository productRepo;


    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return (List<Product>) productRepo.findAll();
    }
}
