package edu.miu.springdatademo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Getter
@Setter
public class Review implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String comment;


    @ManyToOne
    Product product;

    @ManyToOne
    User user;

    public Review(String comment) {
        this.comment = comment;
    }

    public Review(String comment, Product product, User user) {
        this.comment = comment;
        this.product = product;
        this.user = user;
    }

    public Review(String comment, User user) {
        this.comment = comment;
        this.user = user;
    }

    public Review(int id, String comment, Product product, User user) {
        this.id = id;
        this.comment = comment;
        this.product = product;
        this.user = user;
    }

    public Review() {
    }


}
