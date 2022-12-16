package com.SpringData1.Lab3.service.impl;

import com.SpringData1.Lab3.Repo.UserRepo;
import com.SpringData1.Lab3.entity.UniDirectional.User;
import com.SpringData1.Lab3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    public void save(User user) {
       userRepo.save(user);
    }

    @Override
    public User getById(Integer id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void saveOrUpdate(User user) {

    }

    @Override
    public void delete(Long id) {

    }
}
