package w1d3.app01.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import w1d3.app01.dto.ProductDto;
import w1d3.app01.entity.AuditFields;
import w1d3.app01.entity.Product;
import w1d3.app01.repository.CategoryRepo;
import w1d3.app01.repository.ProductRepo;
import w1d3.app01.service.ProductService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo repo;
    private final ModelMapper modelMapper;

    // CRUD Operations
    //Create
    @Override
    public ProductDto save(ProductDto product) {
        var newProd = repo.save(modelMapper.map(product,Product.class));
        return modelMapper.map(newProd, ProductDto.class);
    }

    //Read(Enquire)

    @Override
    public List<ProductDto> getAllProducts() {
        List<ProductDto> listDto = new ArrayList<>();
        var products = repo.findAll();
        products.forEach(p -> {
            if(!p.isDeleted())
                listDto.add(modelMapper.map(p, ProductDto.class));
        });
        return listDto;
    }

    @Override
    public ProductDto getById(int id){
        var product = repo.findById(id).get();
        return modelMapper.map(product, ProductDto.class);
    }

    @Override
    public List<ProductDto> getByMinPrice(double price) {
        List<ProductDto> listDto = new ArrayList<>();
        var products = repo.findAllByPriceGreaterThan(price);
        products.forEach(
                p -> listDto.add(modelMapper.map(p, ProductDto.class)));
        return listDto;
    }

    @Override
    public List<ProductDto> getByMaxPriceAndCat(double price,int categoryId) {
        var products = repo.findAllByCategory_IdAndPriceLessThan(categoryId, price);
//        var products = repo.findAllByCategory_Id(categoryId);
        List<ProductDto> listDto = new ArrayList<>();

         products.forEach(p -> {
            if(p.isDeleted())
                listDto.add(modelMapper.map(p, ProductDto.class));
        });
        return listDto;
    }

    @Override
    public List<ProductDto> getByName(String keyword) {
        var products = repo.findAllByNameContaining(keyword);
        List<ProductDto> listDto = new ArrayList<>();

        products.forEach(p -> {
            if(p.isDeleted())
                listDto.add(modelMapper.map(p, ProductDto.class));
        });
        return listDto;
    }
   //Update
    @Override
    public ProductDto update(ProductDto p) {
        repo.deleteById(p.getId());
        return save(p);
    }

    @Override
    public void deleteById(int id) {
        Product p = repo.findById(id).get();
        //updateDt needs to be updated.
        //AuditFields a = new AuditFields();
        p.setDeleted(true);
        repo.save(p);
    }

}