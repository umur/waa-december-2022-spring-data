package edu.miu.lab3.service;

import edu.miu.lab3.dto.AddressDto;
import edu.miu.lab3.entity.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    AddressDto create(AddressDto addressDto);

    AddressDto update(int addressId, AddressDto addressDto);

    void delete(int addressId);

    ///////////////////////// GET Methods /////////////////////////

    List<AddressDto> getAll();

    AddressDto getById(int addressId);

}
