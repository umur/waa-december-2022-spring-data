package com.SpringData1.Lab3.service;

import com.SpringData1.Lab3.entity.UniDirectional.Address;

import java.util.List;

public interface AddressService {
    public void saveOrUpdate(Address address);
    public void delete(int id);

    public Address get(int id);
    public List<Address> getAll();
}
