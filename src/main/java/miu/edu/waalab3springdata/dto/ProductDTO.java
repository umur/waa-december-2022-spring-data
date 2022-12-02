package miu.edu.waalab3springdata.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import miu.edu.waalab3springdata.entity.Category;
import miu.edu.waalab3springdata.entity.Review;

import java.util.List;

@Data
public class ProductDTO {
    private int id;
    private String name;
    private double price;
    private int rating;

    private CategoryDTO category;
    private List<ReviewDTO> reviews;
}