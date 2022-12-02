package com.example.springdata.dto;

import com.example.springdata.entity.Category;
import com.example.springdata.entity.Review;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
public class ProductDto {
    private int id;
    private String name;
    private double price;
    private int rating;

    @JsonIgnoreProperties("product")
    private List<ReviewDto> reviews;

    @JsonIgnoreProperties("products")
    private CategoryDto category;
}
