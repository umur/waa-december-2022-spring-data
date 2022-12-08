package edu.miu.springdatademo.controller;

import edu.miu.springdatademo.dto.ProductDto;
import edu.miu.springdatademo.dto.ReviewDto;
import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.repository.ProductRepo;
import edu.miu.springdatademo.service.ProductService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Data
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final ProductRepo productRepo;
    @GetMapping()
    public List<ProductDto> getAll(){
         //return this.productService.findAll();
         //System.out.println(this.productRepo.findById(1).get());
        //return this.productService.findAll();
        return this.productService.getAll();
         // return null;
//        return this.productRepo.findProductByPriceGreaterThan();
    }

    @GetMapping("/filterby")
    public List<ProductDto>getAllFilterByPriceLess(@RequestParam(required = false)  Integer price
    ,@RequestParam(required = false) String cat, @RequestParam(required = false)String subname){
        if(cat!=null && price!=null){
            System.out.println("it not null : "+cat);
            return this.productService.findAllByCategoryNameAndPriceLess(cat,price);

        }
        if(price!=null)
        return productService.findFilterByPriceLess(price);
        if(subname!=null)
            return productService.findAllByNameContaining(subname);
        return null;
    }

    @GetMapping("/{id}/reviews")
    public List<ReviewDto> getReviewsOfProductWithId(@PathVariable  int id){
        return this.productService.findProductByIdReviews(id);
    }



}
