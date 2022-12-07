package waa.assignment.three.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import waa.assignment.three.dto.CategoryDto;
import waa.assignment.three.entity.Category;
import waa.assignment.three.repository.CategoryRepository;
import waa.assignment.three.service.CategoryService;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;


    public List<CategoryDto> getCategories() {
        return StreamSupport.stream(categoryRepository.findAll().spliterator(),false).map(category -> modelMapper.map(category, CategoryDto.class)).toList();
    }

    public void saveCategory(CategoryDto category) {
        categoryRepository.save(modelMapper.map(category, Category.class));


    }

    public CategoryDto getCategory(long id) {
        return modelMapper.map(categoryRepository.findById(id).get(), CategoryDto.class);
    }

    public void deleteCategory(long id) {
        categoryRepository.deleteById(id);
    }

    public void updateCategory(long id, CategoryDto categoryDto) {
        Category category = categoryRepository.findById(id).get();
        category.setName(categoryDto.getName());
        categoryRepository.save(category);

    }
}
