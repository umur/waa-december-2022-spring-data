package com.example.waalab3.service;

import com.example.waalab3.model.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    Address save(Address address);

    List<Address> findAll();

    public void delete(Integer id);
    public Optional<Address> get(Integer id);
}
