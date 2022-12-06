package edu.miu.lab3.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AddressDto {

    private int id;

    private String street;

    private String zip;

    private String city;
}
