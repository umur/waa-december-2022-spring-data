package miu.edu.waalab3springdata.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.waalab3springdata.entity.Product;

import java.util.List;

@Data
public class CategoryDTO {

    private int id;
    private String name;

    @JsonIgnore
    List<ProductDTO> products;

}