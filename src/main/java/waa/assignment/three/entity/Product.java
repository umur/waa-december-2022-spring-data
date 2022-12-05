package waa.assignment.three.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    private double price;

    @ManyToOne
    private Category category;

    @Fetch(FetchMode.JOIN)
    @OneToMany(mappedBy = "product",cascade = CascadeType.PERSIST)
    private List<Review> reviews;
    private int rating;
}
