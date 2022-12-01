package com.miu.springdataday3.dto;

import com.miu.springdataday3.entity.Address;
import jakarta.persistence.OneToOne;
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
