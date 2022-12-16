package com.SpringData1.Lab3.controller;


import com.SpringData1.Lab3.entity.UniDirectional.Address;
import com.SpringData1.Lab3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/address")
public class AddressController {

    public final AddressService addressService;

    public void getById(@PathVariable int id) {
        addressService.get(id);
    }

    @GetMapping
    public List<Address> GetAll() {
        return addressService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Address address) {
        addressService.saveOrUpdate(address);
    }

    @PutMapping
    public void update(@RequestBody Address address) {
        addressService.saveOrUpdate(address);
    }

    @DeleteMapping
    public void delete(@PathVariable int id) {
        addressService.delete(id);
    }


}