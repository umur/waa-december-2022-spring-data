package w1d3.app01.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

@Data
public class ReviewDto {

    private int id;
    private String comment;
    private AuditFieldsDto auditFields;

//    @JsonIgnoreProperties("reviews")
    @JsonBackReference
    private ProductDto product;

//    @JsonIgnoreProperties("User")
    @JsonBackReference
    private UserDto user;
}
