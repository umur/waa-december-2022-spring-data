package com.example.springdata.controller;

import com.example.springdata.entity.Category;
import com.example.springdata.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

public final CategoryService service;
   @GetMapping
    public List<Category> getAllCategory(){
    return service.getAllCategory();
}
@PostMapping
    public void saveCategory(@RequestBody Category category){
    service.save(category);
}
}


