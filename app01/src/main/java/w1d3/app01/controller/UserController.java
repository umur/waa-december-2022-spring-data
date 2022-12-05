package w1d3.app01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import w1d3.app01.dto.UserDto;
import w1d3.app01.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAll(){
        System.out.printf("getAll %n");

        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDto getOne(@PathVariable int id){
        System.out.printf("getOne %s%n", id);
        return userService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable int id){
        System.out.printf("deleteOne %s%n", id);

        userService.delete(id);
    }

    @PutMapping("/{id}")
    public UserDto updateOne(@RequestBody UserDto p){
        System.out.printf("update %s%n", p);

        return userService.update(p);
    }

}
