package com.example.waalab3.service.impl;

import com.example.waalab3.model.Address;
import com.example.waalab3.repository.AddressRepository;
import com.example.waalab3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    public final AddressRepository addressRepository;


    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> findAll() {
        return (List<Address>) addressRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        addressRepository.deleteById(id);
    }

    @Override
    public Optional<Address> get(Integer id) {
        return addressRepository.findById(id);
    }
}
