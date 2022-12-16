package com.SpringData1.Lab3.Repo;

import com.SpringData1.Lab3.entity.UniDirectional.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {
    public List<Product> findAllProductGreaterThan(double minPrice);
    public List<Product> findByName(String name);
}
