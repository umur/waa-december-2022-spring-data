package com.example.waalab3.controller;

import com.example.waalab3.model.Address;
import com.example.waalab3.model.Category;
import com.example.waalab3.service.impl.AddressServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/address")
public class AddressController {
    public final AddressServiceImpl addressService;
    @PostMapping
    public void save(@RequestBody Address address){
        addressService.save(address);
    }

    @GetMapping
    public List<Address> getAll(){
        return addressService.findAll();
    }

    @PostMapping("/{id}")
    public void getById(@PathVariable Integer id) {
        addressService.get(id);
    }

    @PutMapping
    public void update(@RequestBody Address address) {
        addressService.save(address);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        addressService.delete(id);
    }


}
