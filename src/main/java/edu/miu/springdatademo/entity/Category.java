package edu.miu.springdatademo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.PERSIST,
            mappedBy = "category"
    )
    @JsonManagedReference

    private List<Product> productList=new ArrayList<>();

    @JsonIgnore
    public List<Product> getProductList() {
        return productList;
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }
    public void addProduct(Product p){
        this.productList.add(p);
    }
    public void removeProduct(Product p){
        this.productList.remove(p);
    }
}
