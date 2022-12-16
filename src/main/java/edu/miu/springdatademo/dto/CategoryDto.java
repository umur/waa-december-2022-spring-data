package edu.miu.springdatademo.dto;

import edu.miu.springdatademo.entity.Product;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryDto {

    private int id;
    private String name;


    //private List<ProductDto> productList=new ArrayList<>();
}
