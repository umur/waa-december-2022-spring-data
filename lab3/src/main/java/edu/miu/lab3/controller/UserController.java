package edu.miu.lab3.controller;

import edu.miu.lab3.dto.UserDto;
import edu.miu.lab3.entity.User;
import edu.miu.lab3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/lab3/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public String create(@RequestBody UserDto userDto) {
        try {
            userService.create(userDto);

            return "User saved successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while saving User.";
        }
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody UserDto userDto) {
        try {
            userService.update(id, userDto);

            return "User updated successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while updating User.";
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        try {
            userService.delete(id);

            return "User deleted successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while deleting User.";
        }
    }

    ///////////////////////// GET Methods /////////////////////////

    @GetMapping
    public List<UserDto> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable int id) {
        return userService.getById(id);
    }

}
