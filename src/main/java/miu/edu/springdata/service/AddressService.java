package miu.edu.springdata.service;

import miu.edu.springdata.entity.Address;

import java.util.List;

public interface AddressService {
    void save(Address address);
    List<Address> findAll();
    Address findById(int id);
    void deleteById(int id);
}
