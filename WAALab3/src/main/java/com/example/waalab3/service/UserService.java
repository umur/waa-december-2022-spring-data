package com.example.waalab3.service;

import com.example.waalab3.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
}
