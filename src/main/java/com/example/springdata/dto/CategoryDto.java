package com.example.springdata.dto;

import com.example.springdata.entity.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    private int id;
    private String name;

    @JsonIgnoreProperties("category")
    private List<ProductDto> products;
}
