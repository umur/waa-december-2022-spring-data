package com.example.lab3.Controller;

import com.example.lab3.Entity.Product;
import com.example.lab3.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController
public class ProductController {
    @Autowired
    private  ProductService prod;
    @PostMapping()
    public Product addProduct(@RequestBody Product product){
        return prod.save(product);
    }
}

