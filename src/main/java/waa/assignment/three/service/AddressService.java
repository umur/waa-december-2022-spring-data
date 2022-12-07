package waa.assignment.three.service;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;
import waa.assignment.three.dto.AddressDto;

import java.util.List;


public interface AddressService {


    void saveAddress(AddressDto address);

    List<AddressDto> getAddresses();

    AddressDto getAddress(long id);

    void deleteAddress(long id);

    void updateAddress(long id, AddressDto addressDto);
}
