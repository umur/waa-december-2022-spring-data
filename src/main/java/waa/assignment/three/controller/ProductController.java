package waa.assignment.three.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import waa.assignment.three.dto.ProductDto;
import waa.assignment.three.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public void saveProduct(@RequestBody ProductDto productDto) {
        productService.saveProduct(productDto);
    }

    @PutMapping("{id}")
    public void updateProduct(@PathVariable long id, @RequestBody ProductDto productDto) {
        productService.updateProduct(id, productDto);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("{id}")
    public ProductDto getProduct(@PathVariable long id) {
        return productService.getProduct(id);
    }

    @GetMapping
    public List<ProductDto> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/category/{id}/price/{price}")
    public List<ProductDto> getProductsByCategoryIdAndPriceLessThan(@PathVariable long id, @PathVariable double price) {
        return productService.getProductsByCategoryIdAndPriceLessThan(id, price);
    }
    @GetMapping("/name/{name}")
    public List<ProductDto> getProductsByNameContains(@PathVariable String name) {
        return productService.getProductsByNameContains(name);
    }
}
