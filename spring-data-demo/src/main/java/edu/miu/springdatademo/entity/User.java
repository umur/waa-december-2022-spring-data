package edu.miu.springdatademo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(mappedBy="product")
    @JsonManagedReference
    private List<Review> reviews;
}