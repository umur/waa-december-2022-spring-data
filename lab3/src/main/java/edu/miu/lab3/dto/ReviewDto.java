package edu.miu.lab3.dto;

import edu.miu.lab3.entity.Product;
import edu.miu.lab3.entity.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ReviewDto {

    private int id;

    private String comment;

    private User user;

    private Product product;
}
