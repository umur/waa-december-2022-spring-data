package com.example.springdata.dto;

import com.example.springdata.entity.Product;
import com.example.springdata.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class ReviewDto {
    private int id;
    private String comment;

    @JsonIgnoreProperties("reviews")
    private ProductDto product;

    @JsonIgnoreProperties("reviews")
    private UserDto user;
}
