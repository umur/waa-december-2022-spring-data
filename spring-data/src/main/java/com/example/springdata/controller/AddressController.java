package com.example.springdata.controller;

import com.example.springdata.entity.Address;
import com.example.springdata.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/v1/addresses")
@RequiredArgsConstructor
public class AddressController {

    public  final AddressService service;

    @GetMapping
    public List<Address> findAllAddress(){
        return service.getAllAddress();
    }

    @PostMapping
    public void saveAddress(@RequestBody Address address){
        service.save(address);
    }
}
