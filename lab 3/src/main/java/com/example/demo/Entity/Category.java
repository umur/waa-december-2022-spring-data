package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Category {
    @Id
    private Long id;
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products;

}
