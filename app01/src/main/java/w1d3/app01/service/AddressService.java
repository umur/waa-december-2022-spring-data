package w1d3.app01.service;


import org.springframework.stereotype.Service;
import w1d3.app01.dto.AddressDto;
import w1d3.app01.dto.ProductDto;

import java.util.List;

@Service
public interface AddressService {
    AddressDto save(AddressDto addressDto);
    List<AddressDto> getAllAddress();
    void delete(int id);
    AddressDto update(AddressDto addressDto);

    AddressDto getById(int id);

}
