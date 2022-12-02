package com.example.springdata.service;

import com.example.springdata.dto.UserDto;

public interface UserService {
    Iterable<UserDto> getAll();
    UserDto getById(int id);
    void save(UserDto user);
    void update(int id, UserDto user);
    void delete(int id);
}

