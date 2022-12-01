package com.miu.springdataday3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

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
