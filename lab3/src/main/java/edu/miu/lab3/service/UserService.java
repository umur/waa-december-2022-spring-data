package edu.miu.lab3.service;

import edu.miu.lab3.dto.UserDto;
import edu.miu.lab3.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    UserDto create(UserDto userDto);

    UserDto update(int userId, UserDto userDto);

    void delete(int userId);

    ///////////////////////// GET Methods /////////////////////////

    UserDto getById(int userId);

    List<UserDto> getAll();

}
