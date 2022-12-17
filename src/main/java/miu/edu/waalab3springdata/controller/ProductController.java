package miu.edu.waalab3springdata.controller;

import miu.edu.waalab3springdata.dto.ProductDTO;
import miu.edu.waalab3springdata.entity.Category;
import miu.edu.waalab3springdata.entity.Product;
import miu.edu.waalab3springdata.entity.Review;
import miu.edu.waalab3springdata.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/product")
    public ProductDTO addProduct(@RequestBody Product product) {
        return this.toDTO(productService.addProduct(product));
    }
    @GetMapping("/product")
    public List<ProductDTO> getAllProducts(){
        return productService.getAllProducts().stream().map(this::toDTO).collect(Collectors.toList());
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable int id){
        return  productService.getProductById(id).map(this::toDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @DeleteMapping("/product/{id}")
    public void deleteProductById(@PathVariable int id){
        productService.removeProductById(id);
    }

    @PutMapping("/product/{id}")
    public ProductDTO updateProduct(@PathVariable int id, @RequestBody Product product){
        product.setId(id);
        return this.toDTO(productService.addProduct(product));
    }

    @GetMapping("/product/min-price/{price}")
    public List<ProductDTO> getAllProductByMinPrice(@PathVariable Double price){
        return productService.getAllProductByMinPrice(price).stream()
                .map(this::toDTO).collect(Collectors.toList());
    }

    @GetMapping("/product/cat")
    public List<ProductDTO> getAllProductByMaxPrice(@RequestParam int id, @RequestParam Double price){
        System.out.println("hellp====================="+id + price);
        return productService.getAllProductByCatAndMinPrice(id,price).stream()
                .map(this::toDTO).collect(Collectors.toList());
    }

    @GetMapping("/product/word")
    public List<ProductDTO> getAllProductByWord(@RequestParam String word){
        return productService.getProductsByContainWord(word).stream()
                .map(this::toDTO).collect(Collectors.toList());
    }

    @GetMapping("/product/review")
    public List<Review> getAllReviewByProductId(@RequestParam int id){
        return productService.getReviewByProductId(id);
    }
    private ProductDTO toDTO(Product product){
        return modelMapper.map(product, ProductDTO.class);
    }
    private Product toEntity(ProductDTO productDTO){
        return modelMapper.map(productDTO, Product.class);
    }
}
