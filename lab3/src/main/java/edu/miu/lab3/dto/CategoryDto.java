package edu.miu.lab3.dto;

import edu.miu.lab3.entity.Product;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class CategoryDto {

    private int id;

    private String name;

}
