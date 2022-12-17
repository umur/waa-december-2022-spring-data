package com.example.demo.repository;
import com.example.demo.Entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product,Long> {

    List<Product> findAllByNameContaining(String name);
    List<Product> findAllByPriceGreaterThan(Long  greaterprice);




}
