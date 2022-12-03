package com.example.lab3springdata.dto.addressDto;

import com.example.lab3springdata.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressBasicDto {
    private int id;
    private String street;
    private int zip;
    private String city;
    private User user;
}
