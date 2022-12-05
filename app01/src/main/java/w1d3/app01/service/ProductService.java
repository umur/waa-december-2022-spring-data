package w1d3.app01.service;


import w1d3.app01.dto.AddressDto;
import w1d3.app01.dto.ProductDto;
import w1d3.app01.entity.Product;

import java.util.List;

public interface ProductService{
    ProductDto save(ProductDto product);
    void deleteById(int id);
    ProductDto update(ProductDto p);
    ProductDto getById(int id);
    List<ProductDto> getAllProducts();

    List<ProductDto> getByMinPrice(double price);
    List<ProductDto> getByMaxPriceAndCat(double price, int categoryId);
    List<ProductDto> getByName(String keyword);

}
