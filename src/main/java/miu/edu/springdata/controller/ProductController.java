package miu.edu.springdata.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.springdata.entity.Product;
import miu.edu.springdata.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/")
    public void save(@RequestBody Product product) {

        productService.save(product);
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable int id) {
        return productService.findById(id);
    }

    @PutMapping("/{id}")
    public void save(@PathVariable int id, @RequestBody Product product) {
        if (id > 0)
            product.setId(id);
        productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        productService.deleteById(id);
    }

    @GetMapping("/pricemorethan/{minPrice}")
    public List<Product> findByPriceGreaterThan(@PathVariable double minPrice) {
        return productService.findByPriceGreaterThan(minPrice);
    }


    @GetMapping("/filterby/category/{cat}/pricelessthan/{maxprice}")
    public List<Product> findByPriceGreaterThan(@PathVariable String cat, @PathVariable double maxprice) {
        return productService.findProductsByCategory_NameAndPriceLessThan(cat, maxprice);
    }

    @GetMapping("/namecontaining/{keyword}")
    public Iterable<Product> findProductsByNameContaining(@PathVariable String keyword){
        return productService.findProductsByNameContaining(keyword);
    }


}
