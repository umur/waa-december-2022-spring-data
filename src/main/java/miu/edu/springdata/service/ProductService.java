package miu.edu.springdata.service;

import miu.edu.springdata.entity.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    List<Product> findAll();
    Product findById(int id);
    void deleteById(int id);
    List<Product> findByPriceGreaterThan(double minPrice);
    List<Product> findProductsByCategory_NameAndPriceLessThan(String cat, double maxPrice);
    Iterable<Product> findProductsByNameContaining(String keyword);
}
