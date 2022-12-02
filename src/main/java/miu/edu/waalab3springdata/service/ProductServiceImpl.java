package miu.edu.waalab3springdata.service;

import miu.edu.waalab3springdata.entity.Category;
import miu.edu.waalab3springdata.entity.Product;
import miu.edu.waalab3springdata.entity.Review;
import miu.edu.waalab3springdata.repository.CategoryRepository;
import miu.edu.waalab3springdata.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public void removeProductById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getAllProductByMinPrice(double price) {
        return productRepository.findByPriceGreaterThan(price);
    }

    @Override
    public List<Product> getAllProductByCatAndMinPrice(int id, double price) {
        Category category = categoryRepository.findById(id).orElse(null);
        if(category==null){
            return null;
        }

        return productRepository.findByCategoryAndPriceLessThan(category, price);
    }

    @Override
    public List<Product> getProductsByContainWord(String keyword) {
        return productRepository.findByNameContains(keyword);
    }

    @Override
    public List<Review> getReviewByProductId(int id) {
        return productRepository.findById(id).map(product -> product.getReviews()).orElseGet(ArrayList::new);
    }
}
