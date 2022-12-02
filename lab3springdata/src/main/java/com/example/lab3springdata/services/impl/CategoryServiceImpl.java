package com.example.lab3springdata.services.impl;

import com.example.lab3springdata.entity.Address;
import com.example.lab3springdata.entity.Category;
import com.example.lab3springdata.repository.AddressRepo;
import com.example.lab3springdata.repository.CategoryRepo;
import com.example.lab3springdata.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;

    public CategoryServiceImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category getById(int id) {
        Category category= categoryRepo.findById(id).get();
        return category;
    }

    @Override
    public List<Category> getAll() {
        List<Category> list = (List<Category>) categoryRepo.findAll();
        return list;
    }

    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void update(int id, Category category) {
        Category oldCategory = categoryRepo.findById(id).get();
        categoryRepo.delete(oldCategory);
        category.setId(id);
        categoryRepo.save(category);
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }
}
