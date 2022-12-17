package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    private Long id;
    private String street;
    private int zip;
    private String city;
    @OneToOne
    private User user;

}
