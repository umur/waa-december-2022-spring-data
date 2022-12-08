package com.example.demo.Service.ServiceImp;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserSer;
import com.example.demo.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserSerImp implements UserSer {
     private UserRepo userRepo;
    @Override
    public void User(User user) {
        userRepo.save(user);
    }

    @Override
    public void delete(Long id) {
         userRepo.deleteById(id);
    }

    @Override
    public  List<User> getById(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        var userList = new ArrayList<User>();
           userRepo.findAll().forEach(userList::add);
           return userList;
    }
}
