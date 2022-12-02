package miu.edu.waalab3springdata.controller;

import miu.edu.waalab3springdata.entity.User;
import miu.edu.waalab3springdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/user")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }
    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable int id){
         userService.deleteUserById(id);
    }
}
