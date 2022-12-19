package com.ProductReview.ProductReviewApp.Controller;

import com.ProductReview.ProductReviewApp.Entity.Product;
import com.ProductReview.ProductReviewApp.Repository.ProductRepository;
import com.ProductReview.ProductReviewApp.Servce.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/")
    List<Product> findAll(){
      return   productService.findAll();
    }
     @GetMapping("/findbyminprice")
    public List<Product> findProductsByPriceLessThan(@RequestParam double price){
        return productService.findProductsByPriceLessThan(price);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
   @GetMapping("/{id}")
  public Product getProductById(@PathVariable Integer id){
        Product optionalProduct= productRepository.findById(id).get();


        return  optionalProduct;
  }


    //    @GetMapping("/findbycatandprice")
//    public List<Product>  findProductsByCategoryAndPriceLessThan(@RequestParam int catId, @RequestParam double price){
//         return productService.findProductsByCategoryAndPriceLessThan(catId,price);
//    }
}
