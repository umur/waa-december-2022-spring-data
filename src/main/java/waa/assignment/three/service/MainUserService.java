package waa.assignment.three.service;



import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import waa.assignment.three.dto.MainUserDto;

import java.util.List;




public interface MainUserService {

    List<MainUserDto> getUsers();

    void saveUser(MainUserDto user);

    MainUserDto getUser(long id);

    void deleteUser(long id);

    void updateUser(long id, MainUserDto userDto);

}
