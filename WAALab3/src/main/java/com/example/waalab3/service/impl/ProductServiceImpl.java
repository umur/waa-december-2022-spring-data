package com.example.waalab3.service.impl;

import com.example.waalab3.model.Product;
import com.example.waalab3.repository.ProductRepository;
import com.example.waalab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    public final ProductRepository productRepository;
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
        //return null;
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> get(Integer id) {
        return productRepository.findById(id);
    }
}
