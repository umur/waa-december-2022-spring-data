package edu.miu.springdatademo.Dto;

import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.entity.User;
import lombok.Data;

@Data
public class ReviewDto {
    private int id;
    private String comment;
    private Product product;
    private User user;
}
