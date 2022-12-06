package edu.miu.lab3.controller;

import edu.miu.lab3.dto.AddressDto;
import edu.miu.lab3.entity.Address;
import edu.miu.lab3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/lab3/addresses")
public class AddressController {

    private final AddressService addressService;

    @PostMapping
    public String create(@RequestBody AddressDto addressDto) {
        try {
            addressService.create(addressDto);

            return "Address saved successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while saving Address.";
        }
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody AddressDto addressDto) {
        try {
            addressService.update(id, addressDto);

            return "Address updated successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while updating Address.";
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        try {
            addressService.delete(id);

            return "Address deleted successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while deleting Address.";
        }
    }

    ///////////////////////// GET Methods /////////////////////////

    @GetMapping
    public List<AddressDto> getAll() {
        return addressService.getAll();
    }

    @GetMapping("/{id}")
    public AddressDto getById(@PathVariable int id) {
        return addressService.getById(id);
    }

}
