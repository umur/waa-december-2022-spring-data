package edu.miu.lab3.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String street;

    private String zip;

    private String city;

    @OneToOne(mappedBy = "address", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JsonIgnore
    private User user;
}
