package com.example.waalab3.controller;

import com.example.waalab3.model.User;
import com.example.waalab3.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user/")
public class UserController {

 public final UserServiceImpl userService;

 @PostMapping("add")
 public void save(@RequestBody  User user){
     userService.save(user);
 }
 @GetMapping
    public List<User> findAll(){
     return userService.findAll();
 }


}
