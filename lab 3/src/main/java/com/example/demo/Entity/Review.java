package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data

public class Review {
     @Id
    private Long id;
    private String comment;
    @ManyToOne
    private Product products;
     @ManyToOne
    private User user;

}
