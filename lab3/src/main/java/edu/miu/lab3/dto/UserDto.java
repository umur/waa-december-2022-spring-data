package edu.miu.lab3.dto;

import edu.miu.lab3.entity.Address;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserDto {

    private int id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private Address address;

}
