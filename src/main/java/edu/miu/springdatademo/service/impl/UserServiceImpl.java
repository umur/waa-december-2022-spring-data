package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.entity.User;
import edu.miu.springdatademo.repository.ProductRepo;
import edu.miu.springdatademo.repository.UserRepo;
import edu.miu.springdatademo.service.ProductService;
import edu.miu.springdatademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public void save(User user) {
        userRepo.save(user);
    }
}
