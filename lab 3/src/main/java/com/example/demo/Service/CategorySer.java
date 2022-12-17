package com.example.demo.Service;

import com.example.demo.Entity.Category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategorySer {
    void save(Category category);
    void delete(Long id);
    Category getById(Long id);
    List<Category> getAll();
}
