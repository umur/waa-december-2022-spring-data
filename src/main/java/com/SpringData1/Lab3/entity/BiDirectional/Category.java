package com.SpringData1.Lab3.entity.BiDirectional;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


    @OneToMany(mappedBy = "category")
    private List<Product> product;
}
