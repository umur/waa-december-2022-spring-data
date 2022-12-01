package miu.edu.springdata.service;

import miu.edu.springdata.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
    User findById(int id);
    void deleteById(int id);
}
