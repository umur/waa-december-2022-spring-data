package edu.miu.lab3.controller;

import edu.miu.lab3.dto.CategoryDto;
import edu.miu.lab3.dto.ProductDto;
import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Product;
import edu.miu.lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/lab3/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public String create(@RequestBody CategoryDto categoryDto) {
        try {
            categoryService.create(categoryDto);

            return "Category saved successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while saving Category.";
        }
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody CategoryDto categoryDto) {
        try {
            categoryService.update(id, categoryDto);

            return "Category updated successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while updating Category.";
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        try {
            categoryService.delete(id);

            return "Category deleted successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while deleting Category.";
        }
    }

    ///////////////////////// GET Methods /////////////////////////

    @GetMapping
    public List<CategoryDto> getAll() {
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public CategoryDto getById(@PathVariable int id) {
        return categoryService.getById(id);
    }

    @GetMapping("/filter-product-by-category-and-price-less-than")
    public List<ProductDto> filterProductByCategoryAndPriceLessThanMaxPrice(@RequestBody String cat, @RequestParam double maxPrice) {
        return categoryService.findAllProductsByCategoryAndPriceLessThan(cat, maxPrice);
    }

}
