package edu.miu.springdatademo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
