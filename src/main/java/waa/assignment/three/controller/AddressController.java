package waa.assignment.three.controller;

import com.sun.tools.javac.Main;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import waa.assignment.three.dto.AddressDto;
import waa.assignment.three.dto.MainUserDto;
import waa.assignment.three.entity.Address;
import waa.assignment.three.entity.MainUser;
import waa.assignment.three.repository.AddressRepository;
import waa.assignment.three.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/addresses")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;
    private final AddressRepository addressRepository;
    private final ModelMapper modelMapper;


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
