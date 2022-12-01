package com.ujjwal.humagain.springdata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    @OneToOne
    private Address address;
}
