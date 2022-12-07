package waa.assignment.three.service;

import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import waa.assignment.three.dto.ProductDto;
import waa.assignment.three.entity.Category;

import java.util.List;



public interface ProductService {

    void saveProduct(ProductDto product);

    ProductDto getProduct(long id);

    void deleteProduct(long id);

    void updateProduct(long id, ProductDto productDto);

    List<ProductDto> getProducts();

    List<ProductDto> getProductsByCategoryIdAndPriceLessThan(long categoryId, double price);

    List<ProductDto> getProductsByNameContains(String name);

    List<ProductDto> getProductsByPriceGreaterThan(double price);

}
