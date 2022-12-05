package edu.miu.springdatalab.controller;

import edu.miu.springdatalab.dto.AddressDto;
import edu.miu.springdatalab.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ankhbayar Azzaya
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("address")
public class AddressController {

    private final AddressService addressService;

    @GetMapping
    public List<AddressDto> findAll() {
        return addressService.findAll();
    }

    @GetMapping("/{id}")
    public AddressDto findById(@PathVariable int id) {
        return addressService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody AddressDto addressDto) {
        addressService.save(addressDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody AddressDto addressDto) {
        addressService.save(addressDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        addressService.delete(id);
    }
}
