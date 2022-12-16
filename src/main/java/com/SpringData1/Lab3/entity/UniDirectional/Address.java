package com.SpringData1.Lab3.entity.UniDirectional;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String zip;
    private String city;

    @JoinColumn(name = "user_id")
    @OneToOne
    private User user;
}
