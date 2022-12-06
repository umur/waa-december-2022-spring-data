package edu.miu.lab3.repository;

import edu.miu.lab3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    List<Product> findAllByPriceGreaterThan(double minPrice);

    List<Product> findAllByNameContaining(String name);

    //List<Product> findAllByPriceLessThanAndCategory_Name(double maxPrice, String categoryName);

}
