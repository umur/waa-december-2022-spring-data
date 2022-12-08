package com.example.demo.Service.ServiceImp;

import com.example.demo.Entity.Product;
import com.example.demo.Entity.Review;
import com.example.demo.Service.ProductSer;
import com.example.demo.repository.ProductRepo;
import com.example.demo.repository.ReviewRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductSerImp implements ProductSer {
    private final ProductRepo preRepo;
    private final ReviewRepo rewRepo;
    @Override
    public void add(Product product) {
        preRepo.save(product);

    }

    @Override
    public void delete(Long id) {
        preRepo.deleteById(id);

    }


    @Override
    public Product getById(Long id) {
        return preRepo.findById(id).get();
    }

    @Override
    public List<Product> findAllByPriceGreaterTha(Long minPrice) {
        return preRepo.findAllByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findAllByNameContaining(String name) {
           return preRepo.findAllByNameContaining(name);
    }

    @Override
    public List<Review> findReviewByProductId(Long id) {
        return   rewRepo.findReviewByProductId(id);
    }

    @Override
    public List<Product> getAll(int id) {
        List<Product> pre= new ArrayList<>();
         preRepo.findAll().forEach(pre::add);
         return pre;
    }
}
