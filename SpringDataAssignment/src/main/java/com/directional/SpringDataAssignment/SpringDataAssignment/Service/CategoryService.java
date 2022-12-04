package com.directional.SpringDataAssignment.SpringDataAssignment.Service;

import com.directional.SpringDataAssignment.SpringDataAssignment.Entity.UniDirectional.Category;
import com.directional.SpringDataAssignment.SpringDataAssignment.Entity.UniDirectional.Product;


import java.util.List;

public interface CategoryService {
    public void saveorUpdate(Category category);
    public void delete(Long id);
    public Category get(Long id);
    public List<Category> getAll();

    public List<Product> getProductByCategoryandPrice(Category category,double maxPrice);
}
