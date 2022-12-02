package miu.edu.service.impl;

import miu.edu.entity.Category;
import miu.edu.repository.CategoryRepo;
import miu.edu.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;

    public CategoryServiceImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category getById(int id) {
        Category category= categoryRepo.findById(id).get();
        return category;
    }

    @Override
    public List<Category> getAll() {
        List<Category> list = (List<Category>) categoryRepo.findAll();
        return list;
    }

    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void update(int id, Category category) {
        Category oldCategory = categoryRepo.findById(id).get();
        categoryRepo.delete(oldCategory);
        category.setId(id);
        categoryRepo.save(category);
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }
}
