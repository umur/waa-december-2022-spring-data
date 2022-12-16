package com.example.springdata.service;

import com.example.springdata.entity.Address;

import java.util.List;

public interface AddressService {
    void save(Address address);

    List<Address> getAllAddress();
}
