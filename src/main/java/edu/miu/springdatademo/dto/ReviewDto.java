package edu.miu.springdatademo.dto;

import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.entity.User;
import lombok.Data;

import javax.persistence.ManyToOne;

@Data
public class ReviewDto {
    private int id;

    private String comment;

    ProductDto product;

    UserDto user;
}
