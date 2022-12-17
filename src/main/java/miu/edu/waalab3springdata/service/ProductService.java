package miu.edu.waalab3springdata.service;

import miu.edu.waalab3springdata.entity.Product;
import miu.edu.waalab3springdata.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ProductService {
    public Product addProduct(Product product);

    public List<Product> getAllProducts();

    public void removeProductById(int id);

    public Optional<Product> getProductById(int id);

    public List<Product> getAllProductByMinPrice(double price);
    public List<Product> getAllProductByCatAndMinPrice(int id, double price);
    public List<Product> getProductsByContainWord(String keyword);
    public List<Review> getReviewByProductId(int id);

}
