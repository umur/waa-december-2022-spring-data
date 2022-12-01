package edu.miu.springdatademo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Table(name="reviews")
public class Review {
    @Id
    private int id;
    private String comment;

    @ManyToOne
    @JsonBackReference
    private Product product;

    @ManyToOne
    private User user;
}
