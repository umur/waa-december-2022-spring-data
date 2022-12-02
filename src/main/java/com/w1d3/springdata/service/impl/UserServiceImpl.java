package com.w1d3.springdata.service.impl;

import com.w1d3.springdata.entity.User;
import com.w1d3.springdata.repository.UserRepo;
import com.w1d3.springdata.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;


    @Override
    public List<User> findAll() {
        return (List<User>)userRepo.findAll();
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }
}
