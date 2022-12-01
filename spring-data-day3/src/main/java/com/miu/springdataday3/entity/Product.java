package com.miu.springdataday3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="products")
public class Product {
    @Id
    private int id;

    private String name;
    private double price;
    private double rating;

    @ManyToOne
    @JsonBackReference
    private Category category;

    @OneToMany(mappedBy="product")
    @JsonManagedReference
    private List<Review> reviews;
}
