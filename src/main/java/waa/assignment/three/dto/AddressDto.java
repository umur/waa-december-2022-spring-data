package waa.assignment.three.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import waa.assignment.three.entity.Address;

@Component
@Setter
@Getter
public class AddressDto {

    private long id;
    private String street;
    private String city;
    private String zipCode;

    private MainUserDto mainUserDto;
}
