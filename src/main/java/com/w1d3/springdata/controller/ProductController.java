package com.w1d3.springdata.controller;

import com.w1d3.springdata.entity.Product;
import com.w1d3.springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public Product findById(@PathVariable int id){
      return  productService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Product product){
        productService.save(product);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Product product) {
        if (id > 0)
            product.setId(id);
        productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        productService.deleteById(id);
    }

}
