package com.example.springdata.controller;

import com.example.springdata.entity.User;
import com.example.springdata.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    public final UserService service;

    @GetMapping
    public List<User> getData(){
        return service.findAll();
    }
    @PostMapping
    public void post(@RequestBody User user){
        service.save(user);
    }

}
