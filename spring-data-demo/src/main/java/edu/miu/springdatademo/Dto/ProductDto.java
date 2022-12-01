package edu.miu.springdatademo.Dto;


import edu.miu.springdatademo.Repository.Category;
import lombok.Data;

@Data
public class ProductDto {
    private int id;
    private String name;
    private double price;
    private double rating;
    private Category category;

}
