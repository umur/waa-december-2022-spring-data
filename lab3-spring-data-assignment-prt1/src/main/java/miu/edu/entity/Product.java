package miu.edu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Product {
    @Id
    private int id;
    private String name;
    private int rating;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Review reviews;

}
