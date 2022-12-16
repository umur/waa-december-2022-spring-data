package com.SpringData1.Lab3.entity.BiDirectional;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Data

public class Address extends com.SpringData1.Lab3.entity.UniDirectional.Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    public User user;
}