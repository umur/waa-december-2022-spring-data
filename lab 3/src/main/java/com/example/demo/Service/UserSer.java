package com.example.demo.Service;


import com.example.demo.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserSer {
    void User(User user);
    void delete(Long id);
    Optional<User> getById(Long id);
    List<User> getAll();
}
