package edu.miu.lab3.service;

import edu.miu.lab3.model.Product;
import edu.miu.lab3.model.Review;

import java.util.List;

public interface ProductService {
    public List<Product> findAllProducts();
    public Product findProductById(int id);
    public void deleteProductById(int id);
    public void updateProduct(int id, Product product);
    public void addProduct(Product product);

    public List<Product> ProductsGreatherThanMinPrice(int minprice);

    List<Review> findAllReviewsByProductId(int id);
}
