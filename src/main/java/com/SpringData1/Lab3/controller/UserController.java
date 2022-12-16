package com.SpringData1.Lab3.controller;


import com.SpringData1.Lab3.entity.UniDirectional.User;
import com.SpringData1.Lab3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {


    public final UserService userService;

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @GetMapping
    public List<User> GetAll() {
        return userService.getAll();
    }

    @PostMapping
    public void add(@RequestBody User user) {
        userService.saveOrUpdate(user);
    }

    @PutMapping
    public void update(@RequestBody User user) {
        userService.saveOrUpdate(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }


}
