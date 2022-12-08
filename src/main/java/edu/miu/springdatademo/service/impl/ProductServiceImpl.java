package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.dto.ProductDto;
import edu.miu.springdatademo.dto.ReviewDto;
import edu.miu.springdatademo.repository.ProductRepo;
import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    final ModelMapper modelMapper;

    @Override
    public List<Product> findAll(){
        return this.productRepo.findAll().stream().toList();
         //return this.productRepo.findAll();
         //return List.of(productRepo.findById(1).get());
    }
    @Override
    public List<ProductDto> getAll(){
        return this.productRepo.findAll().stream().map(e->modelMapper.map(e, ProductDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findFilterByPriceLess(int price){
        return productRepo.findAllByPriceLessThan(price).stream().map(e->modelMapper.map(e, ProductDto.class)).toList();
    }

    @Override
    public List<ProductDto> findAllByCategoryNameAndPriceLess(String catName, int price){
        return this.productRepo.findAllByCategoryNameAndPriceLess(catName,price).stream().map(e->modelMapper.map(e,ProductDto.class)).toList();
    }

    @Override
    public List<ProductDto> findAllByNameContaining(String subname) {
        return this.productRepo.findAllByNameContaining(subname).stream().map(e->modelMapper.map(e,ProductDto.class)).toList();
    }

    @Override
    public List<ReviewDto> findProductByIdReviews(int id) {
        return this.productRepo.findById(id).get().getReviews().stream()
                .map(e->modelMapper.map(e,ReviewDto.class)).toList();
    }


    @Override
    public void save(Product product) {
    productRepo.save(product);
    }
}
