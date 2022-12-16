package edu.miu.springdatademo.dto;

import edu.miu.springdatademo.entity.Address;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
@Data
public class UserDto {
    private int id;

    String email;
    String password;
    String firstname;
    String lastname;
    AddressDto address;
}
