package edu.miu.lab3.controller;

import edu.miu.lab3.dto.ProductDto;
import edu.miu.lab3.dto.ReviewDto;
import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Product;
import edu.miu.lab3.entity.Review;
import edu.miu.lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/lab3/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public String create(@RequestBody ProductDto productDto) {
        try {
            productService.create(productDto);

            return "Product saved successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while saving Product.";
        }
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody ProductDto productDto) {
        try {
            productService.update(id, productDto);

            return "Product updated successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while updating Product.";
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        try {
            productService.delete(id);

            return "Product deleted successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while deleting Product.";
        }
    }

    ///////////////////////// GET Methods /////////////////////////

    @GetMapping
    public List<ProductDto> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable int id) {
        return productService.getById(id);
    }

    @GetMapping("/filter-by-price-greater-than")
    public List<ProductDto> filterAllByPriceGreaterThan(@RequestParam double minPrice) {
        return productService.findAllByPriceGreaterThan(minPrice);
    }

    @GetMapping("/filter-by-name-containing")
    public List<ProductDto> filterAllByNameContaining(@RequestParam String name) {
        return productService.findAllByNameContaining(name);
    }

    @GetMapping("/{id}/reviews")
    public List<ReviewDto> findReviewsOfProduct(@PathVariable int id){
        return productService.findReviewsOfProduct(id);
    }

}
