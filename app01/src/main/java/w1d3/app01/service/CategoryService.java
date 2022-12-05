package w1d3.app01.service;

import org.springframework.stereotype.Service;
import w1d3.app01.dto.AddressDto;
import w1d3.app01.dto.CategoryDto;
import w1d3.app01.entity.Category;

import java.util.List;

public interface CategoryService {
    CategoryDto save(CategoryDto category);
    List<CategoryDto> getAllCategory();
    CategoryDto getById(int id);
    void delete(int id);
    CategoryDto update(CategoryDto category);

}
