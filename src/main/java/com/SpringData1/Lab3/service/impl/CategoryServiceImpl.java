package com.SpringData1.Lab3.service.impl;

import com.SpringData1.Lab3.Repo.CategoryRepo;
import com.SpringData1.Lab3.entity.UniDirectional.Category;
import com.SpringData1.Lab3.entity.UniDirectional.Product;
import com.SpringData1.Lab3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public void save(Category category){
        categoryRepo.save(category);
    }

    @Override
    public void saveorUpdate(Category category) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Category get(int id) {
        return null;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }

    @Override
    public List<Product> getProductByCategoryandPrice(Category category, double maxPrice) {
        return null;
    }
}
