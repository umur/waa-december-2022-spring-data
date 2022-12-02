package com.example.lab3springdata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Product {
    @Id
    private int id;
    private String name;
    private int price;
    private int rating;

    @ManyToOne
    private Category category;


    @OneToMany(mappedBy = "product")
     private List<Review> reviews;


}
