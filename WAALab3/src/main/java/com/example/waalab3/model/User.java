package com.example.waalab3.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    List<Review> reviewList;

    @JsonIgnore
    @OneToOne
    Address address;
}
