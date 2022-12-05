package w1d3.app01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import w1d3.app01.dto.ProductDto;
import w1d3.app01.entity.Product;
import w1d3.app01.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDto> getAll(){
        System.out.printf("getAll %n");

        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductDto getOne(@PathVariable int id){
        System.out.printf("getOne %s%n", id);
        return productService.getById(id);
    }

    @GetMapping("/filterByMinPrice")
    public List<ProductDto> getByMinPrice(@RequestParam double minPrice){
        System.out.printf("getByMinPrice %s%n", minPrice);

        return productService.getByMinPrice(minPrice);
    }

    @GetMapping("/filterByMaxPriceAndCategory")
    public List<ProductDto> getByMaxPriceAndCat(@RequestParam double maxPrice, @RequestParam int categoryId){
        System.out.printf("getByMaxPriceAndCat %s%n", categoryId);

        return productService.getByMaxPriceAndCat(maxPrice, categoryId);
    }

    @GetMapping("/filterByName")
    public List<ProductDto> getByName(@RequestParam String keyword){
        System.out.printf("getByName %s%n", keyword);

        return productService.getByName(keyword);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable int id){
        System.out.printf("deleteOne %s%n", id);

        productService.deleteById(id);
    }

    @PutMapping("/{id}")
    public ProductDto updateOne(@RequestBody ProductDto p){
        System.out.printf("update %s%n", p);

        return productService.update(p);
    }

}
