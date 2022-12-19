package com.ProductReview.ProductReviewApp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {


   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String name;
    private double price;
    private int rating;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY,cascade =CascadeType.ALL )
    Set<Review> reviews;
}
