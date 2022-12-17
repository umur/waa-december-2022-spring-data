package com.product.ReviewApp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private float price;
    private int rating;

//    @JoinColumn(name = "product_id")
    @JsonManagedReference
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @Fetch(FetchMode.SELECT)
    private Category category;

    public void addReview(Review review) {
        reviews.add(review);
        review.setProduct(this);
    }
}


