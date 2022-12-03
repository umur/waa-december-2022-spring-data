package edu.miu.labthree.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Review> reviewList;
}
