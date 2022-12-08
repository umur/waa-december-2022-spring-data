package edu.miu.springdatademo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.miu.springdatademo.entity.Category;
import edu.miu.springdatademo.entity.Review;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class ProductDto {
    private int id;
    private String name;
    private int price;
    private int rating;
    CategoryDto category;

   // List<ReviewDto> reviews;
}
