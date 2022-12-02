package com.example.springdata.service.impl;

import com.example.springdata.dto.CategoryDto;
import com.example.springdata.entity.Category;
import com.example.springdata.repository.CategoryRepo;
import com.example.springdata.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;
    private final ModelMapper modelMapper;
    @Override
    public Iterable<CategoryDto> getAll() {
        List<CategoryDto> list = new ArrayList<>();
        var categories = categoryRepo.findAll();
        categories.forEach(p -> list.add(modelMapper.map(p, CategoryDto.class)));
        return list;
    }

    @Override
    public CategoryDto getById(int id) {
        return modelMapper.map(categoryRepo.findById(id).get(), CategoryDto.class);
    }

    @Override
    public void save(CategoryDto category) {
        categoryRepo.save(modelMapper.map(category, Category.class));
    }

    @Override
    public void update(int id, CategoryDto category) {
        categoryRepo.save(modelMapper.map(category, Category.class));
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }
}
