package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data

public class Product {
    @Id
    private Long id;
    private String name;
    private double price;
    private double rating;
    @ManyToOne
    private Category category;
    @OneToMany(mappedBy = "products")
    private List <Review> reviews;

}
