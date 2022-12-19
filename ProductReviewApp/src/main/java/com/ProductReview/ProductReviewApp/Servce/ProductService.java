package com.ProductReview.ProductReviewApp.Servce;

import com.ProductReview.ProductReviewApp.Entity.Product;
import com.ProductReview.ProductReviewApp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public List<Product> findProductsByPriceLessThan(double price){
        return productRepository.findProductsByPriceLessThan(price);
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }


//    public List<Product>  findProductsByCategoryAndPriceLessThan(int catId,double price){
//        return productRepository.findProductsByCategoryAndPriceLessThan(catId,price);
//    }

}
