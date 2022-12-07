package waa.assignment.three.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.assignment.three.dto.AddressDto;
import waa.assignment.three.entity.Address;
import waa.assignment.three.entity.MainUser;
import waa.assignment.three.repository.AddressRepository;
import waa.assignment.three.service.AddressService;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
@Transactional
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    private final ModelMapper modelMapper;

    public void saveAddress(AddressDto address) {
        addressRepository.save(modelMapper.map(address, Address.class));


    }


    public List<AddressDto> getAddresses() {
      return StreamSupport.stream(addressRepository.findAll().spliterator(),false).map(address -> modelMapper.map(address, AddressDto.class)).toList();



    }

    public AddressDto getAddress(long id) {
        return modelMapper.map(addressRepository.findById(id).get(), AddressDto.class);
    }

    public void deleteAddress(long id) {
        addressRepository.deleteById(id);
    }

    public void updateAddress(long id, AddressDto addressDto) {
        Address address = addressRepository.findById(id).get();
        address.setStreet(addressDto.getStreet());
        address.setCity(addressDto.getCity());
        address.setUser(modelMapper.map(addressDto.getMainUserDto(), MainUser.class));
        addressRepository.save(address);

    }
}
