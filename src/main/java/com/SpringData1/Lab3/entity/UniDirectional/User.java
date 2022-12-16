package com.SpringData1.Lab3.entity.UniDirectional;

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
    private String firstname;
    private String lastname;

    @JoinColumn(name="user_id")
    @OneToMany
    private List<Review> review;

}
