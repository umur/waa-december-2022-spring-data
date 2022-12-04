package edu.miu.lab3.service;

import edu.miu.lab3.model.Product;
import edu.miu.lab3.model.Review;
import edu.miu.lab3.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    public List<Product> findAllProducts(){
        List<Product> products = new ArrayList<>();
        productRepo.findAll().forEach(products :: add);
        return products;
    }
    public Product findProductById(int id){
        return productRepo.findById(id).get();
    }
    public void deleteProductById(int id){
        productRepo.deleteById(id);
    }
    public void updateProduct(int id, Product product){
        Product productFounded = productRepo.findById(id).orElse(null);
        if (productFounded != null) {
            productFounded.setId(product.getId());
            productFounded.setName(product.getName());
            productFounded.setCategory(product.getCategory());

        }
    }
    public void addProduct(Product product){
        productRepo.save(product);
    }
    @Override
    public List<Product> ProductsGreatherThanMinPrice(int minprice) {
        return productRepo.findAllByPriceGreaterThan(minprice);
    }

    @Override
    public List<Review> findAllReviewsByProductId(int id) {
        return productRepo.findById(id).get().getReviews();
    }
}
