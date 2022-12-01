package edu.miu.springdatademo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name="addresses")
public class Address {
    @Id
    private int id;

    private String street;
    private int zip;
    private String city;
    @OneToOne
    private User user;
}
