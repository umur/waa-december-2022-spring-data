package miu.edu.springdata.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.springdata.entity.Product;
import miu.edu.springdata.repository.ProductRepo;
import miu.edu.springdata.service.ProductService;
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
}

