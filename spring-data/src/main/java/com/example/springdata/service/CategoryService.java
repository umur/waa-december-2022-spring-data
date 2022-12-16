package com.example.springdata.service;

import com.example.springdata.entity.Category;

import java.util.List;

public interface CategoryService {
    void save(Category category);
    List<Category> getAllCategory();
}
