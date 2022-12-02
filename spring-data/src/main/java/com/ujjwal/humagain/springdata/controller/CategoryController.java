package com.ujjwal.humagain.springdata.controller;

import com.ujjwal.humagain.springdata.entity.dto.CategoryDto;
import com.ujjwal.humagain.springdata.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> findAll(){
        return categoryService.findAll();
    }
    @GetMapping("/{id}")
    public CategoryDto findById(@PathVariable int id){
        return categoryService.findById(id);
    }
    @PostMapping
    public void save(@RequestBody CategoryDto categoryDto){
        categoryService.save(categoryDto);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody CategoryDto categoryDto){
        categoryService.update(id, categoryDto);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        categoryService.delete(id);
    }
}
