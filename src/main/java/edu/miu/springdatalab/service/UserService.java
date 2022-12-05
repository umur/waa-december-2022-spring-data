package edu.miu.springdatalab.service;


import edu.miu.springdatalab.dto.UserDto;

import java.util.List;

/**
 * @author Ankhbayar Azzaya
 */
public interface UserService {

    List<UserDto> findAll();
    UserDto findById(int id);
    void deleteById(int id);
    void update(int id, UserDto userDto);
    void save(UserDto userDto);
}
