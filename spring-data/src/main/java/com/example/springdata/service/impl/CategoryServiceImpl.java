package com.example.springdata.service.impl;

import com.example.springdata.entity.Category;
import com.example.springdata.repository.CategoryRepository;
import com.example.springdata.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    public final CategoryRepository categoryRepo;
    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return (List<Category>) categoryRepo.findAll();
    }
}
