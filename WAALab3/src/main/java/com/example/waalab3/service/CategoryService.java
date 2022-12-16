package com.example.waalab3.service;

import com.example.waalab3.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category save(Category category);

    List<Category> findAll();

    public void delete(Integer id);

    Optional<Category> get(Integer id);
}
