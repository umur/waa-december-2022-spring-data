package com.SpringData1.Lab3.service.impl;

import com.SpringData1.Lab3.Repo.ProductRepo;
import com.SpringData1.Lab3.entity.UniDirectional.Product;
import com.SpringData1.Lab3.entity.UniDirectional.Review;
import com.SpringData1.Lab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;
    public void save (Product product){
        productRepo.save(product);
    }

    @Override
    public Product get(Integer id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public void saveOrUpdate(Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Product> findAllProductGreaterThan(Double minPrice) {
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }

    @Override
    public List<Review> findReviewById(Long id) {
        return null;
    }

}
