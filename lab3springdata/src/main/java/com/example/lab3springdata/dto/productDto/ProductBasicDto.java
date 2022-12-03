package com.example.lab3springdata.dto.productDto;



import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class ProductBasicDto {
    private int id;
    private String name;
    private int price;
    private int rating;
}
