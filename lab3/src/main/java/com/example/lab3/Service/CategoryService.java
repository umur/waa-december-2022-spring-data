package com.example.lab3.Service;

import com.example.lab3.Entity.Category;
import com.example.lab3.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    void save(Category category);

    void delete(int categoryId);

    Category getById(int categoryId);

    List<Category> getAll();

    List<Product>  findAllByCategoryAndPriceLessThan(Category category,int maxPrice);
}
