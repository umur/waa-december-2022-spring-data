package waa.assignment.three.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import waa.assignment.three.entity.Category;

import java.util.List;
import java.util.stream.Collectors;


@Component
@Setter
@Getter
public class CategoryDto {

    private long id;
    private String name;

    private List<ProductDto> productsDto;



}
