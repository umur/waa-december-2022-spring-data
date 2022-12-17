package com.example.demo.Entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "user_tbl")
public class User {
    @Id
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @OneToOne(mappedBy = "user")
    private Address address;
    @OneToMany(mappedBy = "user")
    private List<Review> reviews;


}
