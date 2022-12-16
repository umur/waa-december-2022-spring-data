package edu.miu.springdatademo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String street;
    int  zip;
    String city;
    @OneToOne(fetch = FetchType.LAZY,
            optional = false)
    User user;

    public Address(String street, int zip, String city) {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    public Address(String street, int zip, String city, User user) {
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.user = user;
    }
    public Address(int id,String street, int zip, String city, User user) {
        this.id=id;
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.user = user;
    }
    public Address() {

    }
}
