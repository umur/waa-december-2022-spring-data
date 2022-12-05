package waa.assignment.three.service.impl;

import com.sun.jdi.event.StepEvent;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import waa.assignment.three.dto.ProductDto;
import waa.assignment.three.entity.Category;
import waa.assignment.three.entity.Product;
import waa.assignment.three.entity.Review;
import waa.assignment.three.repository.ProductRepository;
import waa.assignment.three.service.ProductService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public void saveProduct(ProductDto product) {
        productRepository.save(modelMapper.map(product, Product.class));
    }

    public ProductDto getProduct(long id) {
        return modelMapper.map(productRepository.findById(id).get(), ProductDto.class);
    }


    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    public void updateProduct(long id, ProductDto productDto) {
        Product product = productRepository.findById(id).get();
        product.setName(productDto.getName());
        product.setRating(productDto.getRating());
        product.setCategory(modelMapper.map(productDto.getCategory(), Category.class));
        product.setPrice(productDto.getPrice());
        product.setReviews(productDto.getReviewDtos().stream().map(reviewDto -> modelMapper.map(reviewDto, Review.class)).collect(Collectors.toList()));
        productRepository.save(product);
    }

    public List<ProductDto> getProducts() {
        return StreamSupport.stream(productRepository.findAll().spliterator(),false).map(product -> modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getProductsByCategoryIdAndPriceLessThan(long categoryId, double price) {
        return StreamSupport.stream(productRepository.findAllByCategoryIdAndPriceLessThan(categoryId, price).spliterator(),false).
                map(product -> modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getProductsByNameContains(String name) {
        return StreamSupport.stream(productRepository.findAllByNameContainsIgnoreCase(name).spliterator(),false).
                map(product -> modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getProductsByPriceGreaterThan(double price) {
        return StreamSupport.stream(productRepository.findAllByPriceGreaterThan(price).spliterator(),false).
                map(product -> modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
    }
}
