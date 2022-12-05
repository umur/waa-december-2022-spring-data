package w1d3.app01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import w1d3.app01.dto.CategoryDto;
import w1d3.app01.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping
    public List<CategoryDto> getAll(){
        System.out.printf("getAll %n");

        return service.getAllCategory();
    }

    @GetMapping("/{id}")
    public CategoryDto getOne(@PathVariable int id){
        System.out.printf("getOne %s%n", id);
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable int id){
        System.out.printf("deleteOne %s%n", id);

        service.delete(id);
    }

    @PutMapping("/{id}")
    public CategoryDto updateOne(@RequestBody CategoryDto p){
        System.out.printf("update %s%n", p);

        return service.update(p);
    }

}
