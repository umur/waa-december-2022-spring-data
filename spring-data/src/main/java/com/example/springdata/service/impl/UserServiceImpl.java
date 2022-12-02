package com.example.springdata.service.impl;

import com.example.springdata.entity.User;
import com.example.springdata.repository.UserRepository;
import com.example.springdata.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    public final UserRepository userRepo;
    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepo.findAll();
    }
}
