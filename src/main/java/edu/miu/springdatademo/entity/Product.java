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

//@Table(name = "products")
@Entity
@Getter
@Setter
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//  @Column(name = "product_name")
    private String name;
    private int price;
    private int rating;


    @ManyToOne()
    @JsonBackReference
    Category category;


    public Category getCategory() {
        return category;
    }

    @OneToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)

    List<Review> reviews=new ArrayList<>();

    public List<Review> getReviews() {
        return reviews;
    }

    public Product() {
    }


    public Product(int id, String name, int price, int rating, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.category = category;
    }

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, int price, int rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public void addReview(Review r){

        this.reviews.add(r);
        r.setProduct(this);

    }
    public void removeReview(Review r){
        this.reviews.remove(r);
    }
    public void setCategory(Category category){
        this.category=category;
        category.addProduct(this);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
