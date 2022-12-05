package waa.assignment.three.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String comment;

    @ManyToOne
    private MainUser user;

    @ManyToOne

    private Product product;

}
