package com.SpringData1.Lab3.service.impl;
import com.SpringData1.Lab3.entity.UniDirectional.Address;
import com.SpringData1.Lab3.Repo.AddressRepo;
import com.SpringData1.Lab3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    public final AddressRepo addressRepo;

    @Override
    public void saveOrUpdate(Address address) {
        AddressRepo.save(address);
    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }

    @Override
    public Address get(int id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public List<Address> getAll() {
        return null;
    }

}
}