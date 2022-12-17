package miu.edu.waalab3springdata.controller;

import miu.edu.waalab3springdata.entity.Category;
import miu.edu.waalab3springdata.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @PostMapping("/category")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }
}
