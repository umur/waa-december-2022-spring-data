package waa.assignment.three.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import waa.assignment.three.dto.CategoryDto;
import waa.assignment.three.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public void saveCategory(@RequestBody CategoryDto categoryDto) {
        categoryService.saveCategory(categoryDto);
    }
    @PutMapping ("{id}")

    public void updateCategory(@PathVariable long id, @RequestBody CategoryDto categoryDto) {
        categoryService.updateCategory(id, categoryDto);
    }
    @DeleteMapping("{id}")
    public void deleteCategory(@PathVariable long id) {
        categoryService.deleteCategory(id);
    }
    @GetMapping("{id}")
    public CategoryDto getCategory(@PathVariable long id) {
        return categoryService.getCategory(id);
    }
    @GetMapping
    public List<CategoryDto> getCategories() {
        return categoryService.getCategories();
    }
}
