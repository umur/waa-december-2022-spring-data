package miu.edu.waalab3springdata.service;

import miu.edu.waalab3springdata.entity.User;

import java.util.List;

public interface UserService {
    public User addUser(User user);

    public List<User> getAllUsers();

    public void deleteUserById(int id);
}
