package com.SpringData1.Lab3.entity.UniDirectional;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @JoinColumn(name="category_Id")
    @OneToMany
    private List<Product> product;
}
