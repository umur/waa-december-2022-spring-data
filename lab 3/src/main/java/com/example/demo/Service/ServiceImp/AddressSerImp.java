package com.example.demo.Service.ServiceImp;


import com.example.demo.Entity.Address;
import com.example.demo.Service.AddressSer;
import com.example.demo.repository.AddressRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressSerImp  implements AddressSer {
    AddressRepo addressRepo;
    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public void delete(Long id) {
         addressRepo.deleteById(id);
    }

    @Override
    public Address getById(Long id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public List<Address> getAll() {
        var addresslist = new ArrayList<Address>();
        addressRepo.findAll().forEach(addresslist::add);
        return addresslist;
    }
}
