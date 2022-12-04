package edu.miu.lab3.controller;

import edu.miu.lab3.model.Product;
import edu.miu.lab3.model.Review;
import edu.miu.lab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAllProducts(){
        return productService.findAllProducts();
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable int id){
        return productService.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable int id){
        productService.deleteProductById(id);
    };

    @PutMapping(value = "/{id}", consumes = {"application/json"})
    public void updateProduct(@PathVariable int id, @RequestBody Product product){
        productService.updateProduct(id, product);
    };

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    };

    @GetMapping("/filter")
    public List<Product> productsGreatherThanMinPrice(@RequestParam int minprice){
        return productService.ProductsGreatherThanMinPrice(minprice);
    }

    @GetMapping("/{id}/reviews")
    public List<Review> reviewsProductById(@PathVariable int id){
        return productService.findAllReviewsByProductId(id);
    }
}
