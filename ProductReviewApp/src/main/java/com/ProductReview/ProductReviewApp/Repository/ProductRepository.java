package com.ProductReview.ProductReviewApp.Repository;

import com.ProductReview.ProductReviewApp.Entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    public List<Product> findProductsByPriceLessThan(double price);

    public List<Product> findAll();

    public Product save(Product product);

    public Optional<Product> findById(Integer id);








   // List<Product> findProductsByCategoryAndPriceLessThan(int catId, double price);
}
