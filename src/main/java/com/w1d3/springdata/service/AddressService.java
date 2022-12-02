package com.w1d3.springdata.service;

import com.w1d3.springdata.entity.Address;

import java.util.List;

public interface AddressService {
    void save(Address address);
    List<Address> findAll();
    Address findById(int id);

    void deleteById(int id);
}
