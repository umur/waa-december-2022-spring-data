package com.example.springdata.Controller;


import com.example.springdata.Entity.User;
import com.example.springdata.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {


    public final UserService addressService;

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id) {
       return addressService.getById(id);
    }

    @GetMapping
    public List<User> GetAll() {
       return addressService.getAll();
    }

    @PostMapping
    public void add(@RequestBody User user) {
        addressService.saveOrUpdate(user);
    }

    @PutMapping
    public void update(@RequestBody User user) {
        addressService.saveOrUpdate(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        addressService.delete(id);
    }


}
