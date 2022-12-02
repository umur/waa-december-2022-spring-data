package com.example.lab3.Service.ServiceImpl;

import com.example.lab3.Entity.Category;
import com.example.lab3.Entity.Product;
import com.example.lab3.Repository.CategoryRepo;
import com.example.lab3.Service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;
    @Override
    public void save(Category category) {
          categoryRepo.save(category);
    }

    @Override
    public void delete(int categoryId) {
        categoryRepo.deleteById(categoryId);
    }

    @Override
    public Category getById(int categoryId) {
        return categoryRepo.findById(categoryId).get();
    }

    @Override
    public List<Category> getAll() {
        var categoryList = new ArrayList<Category>();
        categoryRepo.findAll().forEach(categoryList::add);

        return categoryList;
    }

    @Override
    public List<Product> findAllByCategoryAndPriceLessThan(Category category, int maxPrice) {
        return categoryRepo.findById(category.getId()).get().getProducts().stream()
                .filter(p -> p.getPrice() < maxPrice).toList();
    }
}
