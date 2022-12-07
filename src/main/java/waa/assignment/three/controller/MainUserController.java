package waa.assignment.three.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import waa.assignment.three.dto.MainUserDto;
import waa.assignment.three.service.MainUserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class MainUserController {

    private final MainUserService userService;




    @PostMapping
    public void saveUser(@RequestBody MainUserDto user) {
        userService.saveUser(user);
    }
    @PutMapping("{id}")
    public void updateUser(@PathVariable long id, @RequestBody MainUserDto userDto) {
        userService.updateUser(id, userDto);
    }
    @GetMapping("{id}")
    public MainUserDto getUser(@PathVariable long id) {
        return userService.getUser(id);
    }
    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
    }

    @GetMapping
    public List<MainUserDto> getUsers() {
        return userService.getUsers();
    }




}
