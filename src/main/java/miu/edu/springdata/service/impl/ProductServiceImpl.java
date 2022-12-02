package miu.edu.springdata.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.springdata.entity.Product;
import miu.edu.springdata.repository.ProductRepo;
import miu.edu.springdata.service.ProductService;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public void save(Product address) {
        productRepo.save(address);
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> findByPriceGreaterThan(double minPrice) {
        return (List<Product>) productRepo.findByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findProductsByCategory_NameAndPriceLessThan(String cat, double maxPrice){
        return (List<Product>) productRepo.findProductsByCategory_NameIgnoreCaseAndPriceLessThan(cat, maxPrice);
    }

    @Override
    public  Iterable<Product> findProductsByNameContaining(String keyword){
        return productRepo.findProductsByNameContainingIgnoreCase(keyword);
    }
}

