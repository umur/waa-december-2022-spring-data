package edu.miu.springdatalab.service.Impl;

import edu.miu.springdatalab.dto.CategoryDto;
import edu.miu.springdatalab.entity.Category;
import edu.miu.springdatalab.repository.CategoryRepo;
import edu.miu.springdatalab.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ankhbayar Azzaya
 */
@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;
    private final ModelMapper mapper;

    @Override
    public void save(CategoryDto categoryDto) {
        categoryRepo.save(mapper.map(categoryDto, Category.class));
    }

    @Override
    public CategoryDto findById(int id) {
        return mapper.map(categoryRepo.findById(id), CategoryDto.class);
    }

    @Override
    public List<CategoryDto> findAll() {
        List<CategoryDto> categoriesDto = new ArrayList<>();
        categoryRepo.findAll()
                .forEach(category -> categoriesDto.add(mapper.map(category, CategoryDto.class)));
        return categoriesDto;
    }

    @Override
    public void delete(int id) {
        Category category = categoryRepo.findById(id).get();
        category.setDeleted(true);
        categoryRepo.save(category);
//        categoryRepo.deleteById(id);
    }

    @Override
    public void update(int id, CategoryDto categoryDto) {
        categoryRepo.save(mapper.map(categoryDto, Category.class));
    }
}
