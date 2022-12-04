package edu.miu.lab3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany(mappedBy = "user1")
    private List<Review> reviews;

    @OneToOne(mappedBy = "user1")
    private Address address;
}
