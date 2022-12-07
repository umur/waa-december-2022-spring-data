package waa.assignment.three.service;


import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import waa.assignment.three.dto.CategoryDto;


import java.util.List;


public interface CategoryService {
    List<CategoryDto> getCategories();

    void saveCategory(CategoryDto category);

    CategoryDto getCategory(long id);

    void deleteCategory(long id);

    void updateCategory(long id, CategoryDto categoryDto);
}
