package com.miu.springdataday3.service.impl;

import com.miu.springdataday3.dto.AddressDto;
import com.miu.springdataday3.entity.Address;
import com.miu.springdataday3.repository.AddressRepo;
import com.miu.springdataday3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<AddressDto> findAll() {
        return addressRepo.findAll().stream().map(a -> modelMapper.map(a, AddressDto.class)).toList();
    }

    @Override
    public AddressDto findById(int id) {
        return addressRepo.findById(id).map(a -> modelMapper.map(a, AddressDto.class)).get();
    }

    @Override
    public void save(AddressDto addressDto) {
        Address address = modelMapper.map(addressDto, Address.class);
        addressRepo.save(address);
    }

    @Override
    public void update(int id, AddressDto addressDto) {
        addressRepo.findById(id).orElseThrow(() -> new RuntimeException("Address not found."));
        Address address = modelMapper.map(addressDto, Address.class);
        addressRepo.save(address);
    }

    @Override
    public void delete(int id) {
        Address address = addressRepo.findById(id).orElseThrow(() -> new RuntimeException("Address not found."));
        addressRepo.delete(address);
    }
}
