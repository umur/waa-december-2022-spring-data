package com.example.springdata.service;

import com.example.springdata.dto.CategoryDto;

public interface CategoryService {
    Iterable<CategoryDto> getAll();
    CategoryDto getById(int id);
    void save(CategoryDto category);
    void update(int id, CategoryDto category);
    void delete(int id);
}

