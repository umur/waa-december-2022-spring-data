package com.example.springdata.service.impl;

import com.example.springdata.entity.Address;
import com.example.springdata.repository.AddressRepository;
import com.example.springdata.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    public final AddressRepository addressRepo;
    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public List<Address> getAllAddress() {
        return (List<Address>) addressRepo.findAll();
    }
}
