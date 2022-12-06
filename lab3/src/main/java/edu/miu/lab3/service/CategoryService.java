package edu.miu.lab3.service;

import edu.miu.lab3.dto.CategoryDto;
import edu.miu.lab3.dto.ProductDto;
import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    CategoryDto create(CategoryDto categoryDto);

    CategoryDto update(int categoryId, CategoryDto categoryDto);

    void delete(int categoryId);

    ///////////////////////// GET Methods /////////////////////////

    List<CategoryDto> getAll();

    CategoryDto getById(int categoryId);

    List<ProductDto> findAllProductsByCategoryAndPriceLessThan(String cat, double maxPrice);

}
