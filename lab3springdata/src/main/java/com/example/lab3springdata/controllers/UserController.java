package com.example.lab3springdata.controllers;

import com.example.lab3springdata.entity.User;

import com.example.lab3springdata.services.impl.UserServiceImpl;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {

        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll(){

        return userService.getAll();
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable int id){
        return userService.getById(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody User user){
        userService.update(id,user);
    }
    @PostMapping
    public void create(@RequestBody User user){
        userService.save(user);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        userService.delete(id);
        return "deleted";
    }



}
