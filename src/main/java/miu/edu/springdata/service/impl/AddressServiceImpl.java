package miu.edu.springdata.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.springdata.entity.Address;
import miu.edu.springdata.repository.AddressRepo;
import miu.edu.springdata.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;

    public void save(Address address){
        addressRepo.save(address);
    }

    @Override
    public List<Address> findAll() {
        return (List<Address>) addressRepo.findAll();
    }

    @Override
    public Address findById(int id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        addressRepo.deleteById(id);
    }
}
