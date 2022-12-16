package com.example.waalab3.controller;

import com.example.waalab3.model.Category;
import com.example.waalab3.service.impl.CategoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

   public final CategoryServiceImpl categoryServiceImpl;


    @PostMapping
    public void save(@RequestBody Category category){
        categoryServiceImpl.save(category);
    }

    @GetMapping
    public List<Category> getAll(){
        return categoryServiceImpl.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> getById(@PathVariable Integer id) {
        return categoryServiceImpl.get(id);
    }

    @PutMapping
    public void update(@RequestBody Category category) {
        categoryServiceImpl.save(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        categoryServiceImpl.delete(id);
    }
}
