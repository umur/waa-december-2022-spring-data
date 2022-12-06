package edu.miu.lab3.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private String password;

    private String firstname;

    private String lastname;

    @OneToMany(mappedBy = "user", cascade =  { CascadeType.PERSIST, CascadeType.MERGE } )
    @JsonIgnore
    private List<Review> reviews;

    @OneToOne
    private Address address;

}
