package com.example.waalab3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
   private int rating;

   @JsonIgnore
   @ManyToOne
   Category category;

   @JsonIgnore
   @OneToMany(mappedBy = "product")
   List<Review> reviewList;

}
