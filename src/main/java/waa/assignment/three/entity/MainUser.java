package waa.assignment.three.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Setter
@Getter

public class MainUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    @OneToOne
    private Address address;
    private String password;

    @Fetch(FetchMode.JOIN)
    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST)
    private List<Review> reviews;


}
