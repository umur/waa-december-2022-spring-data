package com.example.lab3.Service;

import com.example.lab3.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void save(User user);

    void delete(int userId);

    User getById(int userId);

    List<User> getAll();
}
