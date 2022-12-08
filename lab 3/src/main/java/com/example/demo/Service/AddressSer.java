package com.example.demo.Service;

import com.example.demo.Entity.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressSer {
    void save(Address address);
    void delete(Long id);
     Address getById(Long id);
     List<Address> getAll();
}
