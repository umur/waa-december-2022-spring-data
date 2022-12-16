package com.example.waalab3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;


    @JsonIgnore
    @ManyToOne
    User user;

    @JsonIgnore
    @ManyToOne
    Product product;
}
