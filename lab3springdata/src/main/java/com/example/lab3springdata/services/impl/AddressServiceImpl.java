package com.example.lab3springdata.services.impl;

import com.example.lab3springdata.entity.Address;
import com.example.lab3springdata.repository.AddressRepo;
import com.example.lab3springdata.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepo addressRepo;

    public AddressServiceImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @Override
    public Address getById(int id) {
        Address address= addressRepo.findById(id).get();
        return address;
    }

    @Override
    public List<Address> getAll() {
        List<Address> list = (List<Address>) addressRepo.findAll();
        return list;
    }

    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public void update(int id, Address address) {
       Address oldAddress = addressRepo.findById(id).get();
       addressRepo.delete(oldAddress);
       address.setId(id);
       addressRepo.save(address);
    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }
}
