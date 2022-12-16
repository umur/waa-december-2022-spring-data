package com.SpringData1.Lab3.entity.UniDirectional;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private double rating;

    @JoinColumn(name = "product_id")
    @OneToMany
    List<Review> review;

}