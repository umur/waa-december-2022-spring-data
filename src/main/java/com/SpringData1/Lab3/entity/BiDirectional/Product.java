package com.SpringData1.Lab3.entity.BiDirectional;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private double rating;


    @OneToMany(mappedBy = "product")
    List<Review> review;

    @ManyToOne
    public Category category;

}