package waa.assignment.three.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Entity
@Setter
@Getter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;


    @OneToMany(mappedBy = "category",cascade = CascadeType.PERSIST)
    private List<Product> products;

}
