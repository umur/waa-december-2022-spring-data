package w1d3.app01.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import w1d3.app01.entity.AuditFields;
import w1d3.app01.entity.Product;

import java.util.List;

@Data
public class CategoryDto {
    private int id;
    private String name;
    private AuditFieldsDto auditFields;

//    @JsonIgnoreProperties("category")
    @JsonManagedReference
    private List<ProductDto> products;

}
