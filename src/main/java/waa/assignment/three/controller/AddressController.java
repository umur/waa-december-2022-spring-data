package waa.assignment.three.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import waa.assignment.three.dto.AddressDto;
import waa.assignment.three.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/addresses")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;


    @PostMapping
    public void saveAddress(@RequestBody AddressDto addressDto) {
        addressService.saveAddress(addressDto);
    }

    @PutMapping("{id}")
    public void updateAddress(@PathVariable long id, @RequestBody AddressDto addressDto) {
        addressService.updateAddress(id, addressDto);
    }
    @DeleteMapping("{id}")
    public void deleteAddress(@PathVariable long id) {
        addressService.deleteAddress(id);
    }
    @GetMapping("{id}")
    public AddressDto getAddress(@PathVariable long id) {
        return addressService.getAddress(id);
    }
    @GetMapping
    public List<AddressDto> getAddresses() {
        return addressService.getAddresses();
    }
}
