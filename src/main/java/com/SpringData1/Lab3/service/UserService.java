package com.SpringData1.Lab3.service;

import com.SpringData1.Lab3.entity.UniDirectional.User;

import java.util.List;

public interface UserService {
    void save (User user);

    User getById(Integer id);

    List<User> getAll();

    void saveOrUpdate(User user);

    void delete(Long id);
}
