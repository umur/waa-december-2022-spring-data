package w1d3.app01.service;

import w1d3.app01.dto.CategoryDto;
import w1d3.app01.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto save(UserDto userDto);
    List<UserDto> getAllUsers();
    UserDto getById(int id);
    void delete(int id);
    UserDto update(UserDto userDto);

}
