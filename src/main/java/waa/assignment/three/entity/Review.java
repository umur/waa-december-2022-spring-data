package waa.assignment.three.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JoinFormula;

import java.util.List;

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
