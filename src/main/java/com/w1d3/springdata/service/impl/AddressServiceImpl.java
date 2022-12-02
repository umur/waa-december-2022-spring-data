package com.w1d3.springdata.service.impl;

import com.w1d3.springdata.entity.Address;
import com.w1d3.springdata.repository.AddressRepo;
import com.w1d3.springdata.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private  final AddressRepo addressRepo;
    @Override
    public void save(Address address) {
    addressRepo.save(address);
    }

    @Override
    public List<Address> findAll() {
        return (List<Address>)addressRepo.findAll();
    }

    @Override
    public Address findById(int id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
    addressRepo.deleteById(id);
    }
}
