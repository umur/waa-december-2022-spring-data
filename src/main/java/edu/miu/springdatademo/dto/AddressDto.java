package edu.miu.springdatademo.dto;

import edu.miu.springdatademo.entity.User;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Data
public class AddressDto {
    private int id;
    String street;
    int  zip;
    String city;
    //UserDto user;
}
