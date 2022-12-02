package com.example.lab3.Service.ServiceImpl;

import com.example.lab3.Entity.Address;
import com.example.lab3.Repository.AddressRepo;
import com.example.lab3.Service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public void delete(int addressId) {
        addressRepo.deleteById(addressId);
    }

    @Override
    public Address getById(int addressId) {
        return addressRepo.findById(addressId).get();
    }

    @Override
    public List<Address> getAll() {
        var addressList = new ArrayList<Address>();
        addressRepo.findAll().forEach(addressList::add);
        return addressList;
    }
}
