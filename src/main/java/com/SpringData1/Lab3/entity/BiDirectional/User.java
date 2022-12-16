package com.SpringData1.Lab3.entity.BiDirectional;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;

    @OneToOne(mappedBy = "user")
    private Address address;


    @OneToMany(mappedBy = "user")
    private List<Review> review;

}