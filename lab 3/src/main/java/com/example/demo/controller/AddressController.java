package com.example.demo.controller;

import com.example.demo.Entity.Address;
import com.example.demo.Service.AddressSer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Address")
public class AddressController {
    final AddressSer addressSer;
    @GetMapping
    public List<Address> getAllAddress(){
        return addressSer.getAll();
    }



}
