package com.example.lab3springdata.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonIgnoreProperties("products")
    private Category category;


    @OneToMany(mappedBy = "product")
    //@JsonManagedReference
   //@JsonBackReference
    @JsonIgnoreProperties("product")
     private List<Review> reviews;


}
