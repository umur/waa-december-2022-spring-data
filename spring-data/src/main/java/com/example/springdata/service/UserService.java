package com.example.springdata.service;

import com.example.springdata.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
}
