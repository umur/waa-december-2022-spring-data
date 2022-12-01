package edu.miu.springdatademo.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

//@Table(name = "products")
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
