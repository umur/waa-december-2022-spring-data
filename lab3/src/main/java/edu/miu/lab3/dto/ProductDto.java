package edu.miu.lab3.dto;

import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Review;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ProductDto {

    private int id;

    private String name;

    private double price;

    private double rating;

    private Category category;
}
