package com.example.lab3springdata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Address {
    @Id
    private int id;
    private String street;
    private int zip;
    private String city;

    @OneToOne (mappedBy = "address")
    private User user;

}
