package miu.edu.service;

import miu.edu.entity.Category;

import java.util.List;

public interface CategoryService {
Category getById (int id);
List<Category> getAll();
void save(Category category);
void update(int id, Category category);
void delete( int id);

}
