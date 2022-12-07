package waa.assignment.three.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class ReviewDto {

    private long id;
    private String comment;

    private MainUserDto mainUserDto;

    private ProductDto productDto;

}
