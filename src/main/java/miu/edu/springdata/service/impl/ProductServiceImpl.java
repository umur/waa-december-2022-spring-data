package miu.edu.springdata.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.springdata.dto.ProductDto;
import miu.edu.springdata.entity.Product;
import miu.edu.springdata.repository.ProductRepo;
import miu.edu.springdata.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ModelMapper mapper;

    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public List<ProductDto> findAll() {
        return getDtoList((List<Product>) productRepo.findAll());
    }

    @Override
    public ProductDto findById(int id) {
        return getDto(productRepo.findById(id).get());
    }

    @Override
    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<ProductDto> findByPriceGreaterThan(double minPrice) {
      return getDtoList((List<Product>) productRepo.findByPriceGreaterThan(minPrice));
    }

    @Override
    public List<ProductDto> findProductsByCategory_NameAndPriceLessThan(String cat, double maxPrice){
        return getDtoList((List<Product>) productRepo.findProductsByCategory_NameIgnoreCaseAndPriceLessThan(cat, maxPrice));
    }

    @Override
    public  List<ProductDto> findProductsByNameContaining(String keyword){
        return getDtoList((List<Product>) productRepo.findProductsByNameContainingIgnoreCase(keyword));
    }

    private List<ProductDto> getDtoList(List<Product> products){
        return products.stream().map(p->{
            return getDto(p);
        }).toList();
    }
    private ProductDto getDto(Product product){
        return mapper.map(product, ProductDto.class);
    }
}

