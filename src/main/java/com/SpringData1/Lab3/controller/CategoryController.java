package com.SpringData1.Lab3.controller;


import com.SpringData1.Lab3.entity.UniDirectional.Category;
import com.SpringData1.Lab3.entity.UniDirectional.Product;
import com.SpringData1.Lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/category")
public class CategoryController {

    public final CategoryService categoryService;

    @GetMapping("/{id}")
    public Category getById(@PathVariable int id) {
        return categoryService.get(id);
    }

    @GetMapping
    public List<Category> GetAll() {
        return categoryService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Category category) {
        categoryService.saveorUpdate(category);
    }

    @PutMapping
    public void update(@RequestBody Category category) {
        categoryService.saveorUpdate(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        categoryService.delete(id);
    }

    @GetMapping("/filterByCategoryAndPrice")
    public List<Product> getProductByCategoryAndPrice(@RequestBody Category cat, @RequestParam double maxPrice)
    {
        return categoryService.getProductByCategoryandPrice(cat,maxPrice);
    }

}