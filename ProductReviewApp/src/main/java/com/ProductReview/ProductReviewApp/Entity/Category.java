package com.ProductReview.ProductReviewApp.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {


      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id;
    private String catg_name;


    @OneToMany
    @JoinColumn(name="cat_id")
    private List<Product> products;

}
