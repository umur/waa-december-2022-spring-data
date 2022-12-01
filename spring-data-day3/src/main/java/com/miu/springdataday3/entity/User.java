package com.miu.springdataday3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {
    @Id
    private int id;

    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToOne
    private Address address;
}
