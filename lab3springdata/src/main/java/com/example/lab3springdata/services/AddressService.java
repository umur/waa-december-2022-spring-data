package com.example.lab3springdata.services;

import com.example.lab3springdata.entity.Address;

import java.util.List;

public interface AddressService {
    Address getById(int id);
    List<Address> getAll();
    void save(Address address);
    void update(int id, Address address);
    void delete(int id);

}
