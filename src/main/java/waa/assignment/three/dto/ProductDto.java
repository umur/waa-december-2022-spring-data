package waa.assignment.three.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import waa.assignment.three.entity.Product;

import java.util.List;
import java.util.stream.Collectors;


@Component
@Setter
@Getter
public class ProductDto {
    private long id;
    private String name;

    private double price;


    private CategoryDto category;


    private List<ReviewDto> reviewDtos;
    private int rating;
}
