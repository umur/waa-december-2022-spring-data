package w1d3.app01.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import w1d3.app01.dto.AddressDto;
import w1d3.app01.entity.Address;
import w1d3.app01.repository.AddressRepo;
import w1d3.app01.service.AddressService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepo repo;
    private final ModelMapper modelMapper;

    // CRUD Operations
    //Create
    @Override
    public AddressDto save(AddressDto a) {
        var newAddress = repo.save(modelMapper.map(a, Address.class));
        return modelMapper.map(newAddress, AddressDto.class);
    }

    //Read(Enquire)
    @Override
    public List<AddressDto> getAllAddress() {
        List<AddressDto> listDto = new ArrayList<>();
        var addresses = repo.findAll();
        addresses.forEach(p -> listDto.add(modelMapper.map(p, AddressDto.class)));
        return listDto;
    }


    //update
    @Override
    public AddressDto update(AddressDto a) {
        delete(a.getId());
        return save(a);
    }

    @Override
    public AddressDto getById(int id) {
        var newAddress = repo.findById(id).get();
        return modelMapper.map(newAddress, AddressDto.class);
    }

    //delete
    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }

}