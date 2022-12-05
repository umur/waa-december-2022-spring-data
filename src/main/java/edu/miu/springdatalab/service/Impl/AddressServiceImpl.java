package edu.miu.springdatalab.service.Impl;

import edu.miu.springdatalab.dto.AddressDto;
import edu.miu.springdatalab.entity.Address;
import edu.miu.springdatalab.repository.AddressRepo;
import edu.miu.springdatalab.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ankhbayar Azzaya
 */

@RequiredArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private final ModelMapper mapper;

    @Override
    public void save(AddressDto addressDto) {
        addressRepo.save(mapper.map(addressDto, Address.class));
    }

    @Override
    public AddressDto findById(int id) {
        return mapper.map(addressRepo.findById(id).get(), AddressDto.class);
    }

    @Override
    public List<AddressDto> findAll() {
        List<AddressDto> addressDtos = new ArrayList<>();
        addressRepo.findAll().forEach(address -> addressDtos.add(mapper.map(address, AddressDto.class)));
        return addressDtos;
    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }

    @Override
    public void update(int id, AddressDto addressDto) {
        addressRepo.save(mapper.map(addressDto, Address.class));
    }
}
