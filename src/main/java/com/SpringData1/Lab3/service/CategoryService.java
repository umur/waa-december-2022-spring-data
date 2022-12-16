package com.SpringData1.Lab3.service;

import com.SpringData1.Lab3.entity.UniDirectional.Category;
import com.SpringData1.Lab3.entity.UniDirectional.Product;

import java.util.List;


public interface CategoryService {
    public void saveorUpdate(Category category);
    public void delete(int id);
    public Category get(int id);
    public List<Category> getAll();

    public List<Product> getProductByCategoryandPrice(Category category, double maxPrice);
}
