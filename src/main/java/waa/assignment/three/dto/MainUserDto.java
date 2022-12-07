package waa.assignment.three.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import waa.assignment.three.entity.MainUser;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Setter
@Getter
public class MainUserDto {


    private long id;
    private String firstName;
    private String lastName;
    private String email;

    private AddressDto address;
    private String password;

    private List<ReviewDto> reviewDtos;


}
