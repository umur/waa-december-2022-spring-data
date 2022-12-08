package edu.miu.springdatademo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "Users")
@Entity
@Getter
@Setter
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    String email;
    String password;
    String firstname;
    String lastname;
    @OneToOne(fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL,
    mappedBy = "user")
    Address address;

    public User(String firstname, String lastname,String email, String password, Address address) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public User(String firstname, String lastname, String email, String password) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public User(int id, String firstname, String lastname, String email, String password) {
        this.id=id;
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;

    }
    public User() {

    }
    public void setAddressWithMap(Address address){
        this.address=address;
        address.setUser(this);
    }
}
