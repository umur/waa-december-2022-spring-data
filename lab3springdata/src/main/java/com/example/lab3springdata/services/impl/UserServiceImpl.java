package com.example.lab3springdata.services.impl;

import com.example.lab3springdata.entity.User;
import com.example.lab3springdata.repository.UserRepo;
import com.example.lab3springdata.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User getById(int id) {
        User user= userRepo.findById(id).get();
        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> list = (List<User>) userRepo.findAll();
        return list;
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public void update(int id, User user) {
        User oldUser = userRepo.findById(id).get();
        userRepo.delete(oldUser);
        user.setId(id);
        userRepo.save(user);
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }
}
