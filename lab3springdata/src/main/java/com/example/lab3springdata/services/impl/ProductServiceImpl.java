package com.example.lab3springdata.services.impl;

import com.example.lab3springdata.entity.Product;
import com.example.lab3springdata.repository.ProductRepo;
import com.example.lab3springdata.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product getById(int id) {
        Product product= productRepo.findById(id).get();
        return product;
    }

    @Override
    public List<Product> getAll() {
        List<Product> list = (List<Product>) productRepo.findAll();
        return list;
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public void update(int id, Product product) {
        Product oldProduct = productRepo.findById(id).get();
        productRepo.delete(oldProduct);
        product.setId(id);
        productRepo.save(product);
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }
}
