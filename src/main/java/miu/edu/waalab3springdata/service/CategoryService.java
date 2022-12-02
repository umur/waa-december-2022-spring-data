package miu.edu.waalab3springdata.service;

import miu.edu.waalab3springdata.entity.Category;

import java.util.List;

public interface CategoryService {
    public void addCategory(Category category);

    public List<Category> getAllCategory();
}
