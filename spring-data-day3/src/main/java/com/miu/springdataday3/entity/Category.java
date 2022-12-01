package com.miu.springdataday3.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="categories")
public class Category {
    @Id
    private int id;

    private String name;

    @OneToMany(mappedBy="category")
    @JsonManagedReference
    private List<Product> products;
}
