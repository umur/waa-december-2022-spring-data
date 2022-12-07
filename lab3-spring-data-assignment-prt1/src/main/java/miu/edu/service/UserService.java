package miu.edu.service;

import miu.edu.entity.User;

import java.util.List;

public interface UserService {

    User getById(int id);
    List<User> getAll();
    void save( User user);
    void update (int id, User user);
    void delete(int id);

}
