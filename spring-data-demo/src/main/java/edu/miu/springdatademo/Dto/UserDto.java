package edu.miu.springdatademo.Dto;

import edu.miu.springdatademo.entity.Address;
import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Address address;
}