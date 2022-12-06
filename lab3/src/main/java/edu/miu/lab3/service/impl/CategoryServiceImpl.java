package edu.miu.lab3.service.impl;

import edu.miu.lab3.dto.CategoryDto;
import edu.miu.lab3.dto.ProductDto;
import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Product;
import edu.miu.lab3.repository.CategoryRepo;
import edu.miu.lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    public final ModelMapper modelMapper;

    @Override
    public CategoryDto create(CategoryDto categoryDto) {
        return modelMapper.map(categoryRepo.save(modelMapper.map(categoryDto, Category.class)), CategoryDto.class);
    }

    @Override
    public CategoryDto update(int categoryId, CategoryDto categoryDto) {
        Category category = modelMapper.map(categoryDto, Category.class);
        category = categoryRepo.save(category);
        return modelMapper.map(category, CategoryDto.class);
    }

    @Override
    public void delete(int categoryId) {
        Category category = categoryRepo.findById(categoryId).orElseThrow(() -> new RuntimeException("Category not found"));
        categoryRepo.delete(category);
    }

    ///////////////////////// GET Methods /////////////////////////

    @Override
    public List<CategoryDto> getAll() {
        return categoryRepo.findAll().stream()
                .map(category -> modelMapper.map(category, CategoryDto.class))
                .toList();
    }

    @Override
    public CategoryDto getById(int categoryId) {
        return modelMapper.map(categoryRepo.findById(categoryId).orElseThrow(() -> new RuntimeException("Category not found")), CategoryDto.class);
    }

    @Override
    public List<ProductDto> findAllProductsByCategoryAndPriceLessThan(String cat, double maxPrice) {
        List<Category> categories = categoryRepo.findAllByNameContaining(cat);
        List<Product> products = categories.stream()
                .flatMap(c -> c.getProducts().stream())
                .distinct()
                .toList();

        products = products.stream().filter(p -> p.getPrice() < maxPrice)
                .toList();

        return products.stream().map(p -> modelMapper.map(p, ProductDto.class))
                .toList();
    }
}
