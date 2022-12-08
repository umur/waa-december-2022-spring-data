package com.example.demo.Service.ServiceImp;

import com.example.demo.Entity.Category;
import com.example.demo.Service.CategorySer;
import com.example.demo.repository.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class  CategorySerImp implements CategorySer {
    private final CategoryRepo catRepo;
    @Override
    public void save(Category category) {
        catRepo.save(category);
    }

    @Override
    public void delete(Long id) {
        catRepo.deleteById(id);
    }

    @Override
    public Category getById(Long id) {
        return catRepo.findById(id).get();
    }

    @Override
    public List<Category> getAll() {
        var categoryList = new ArrayList<Category>();
        catRepo.findAll().forEach(categoryList::add);
        return categoryList;
    }
}
