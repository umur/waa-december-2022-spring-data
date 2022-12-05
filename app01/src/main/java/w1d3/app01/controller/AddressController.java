package w1d3.app01.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import w1d3.app01.dto.AddressDto;
import w1d3.app01.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor

public class AddressController {
    private final AddressService service;

    @GetMapping
    public List<AddressDto> getAll(){
        System.out.printf("getAll %n");

        return service.getAllAddress();
    }

    @GetMapping("/{id}")
    public AddressDto getOne(@PathVariable int id){
        System.out.printf("getOne %s%n", id);
        return service.getById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable int id){
        System.out.printf("deleteOne %s%n", id);

        service.delete(id);
    }

    @PutMapping("/{id}")
    public AddressDto updateOne(@RequestBody AddressDto p){
        System.out.printf("update %s%n", p);

        return service.update(p);
    }

}
