package com.SpringData1.Lab3.entity.BiDirectional;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String comment;

    @ManyToOne
    public Product product;

    @ManyToOne
    public User user;

}