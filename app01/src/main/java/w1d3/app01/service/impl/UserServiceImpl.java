package w1d3.app01.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import w1d3.app01.dto.UserDto;
import w1d3.app01.entity.User;
import w1d3.app01.repository.UserRepo;
import w1d3.app01.service.UserService;
import org.modelmapper.ModelMapper;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final ModelMapper mapper;
    private final UserRepo repo;

    @Override
    public UserDto save(UserDto userDto) {
        var users = repo.save(mapper.map(userDto, User.class));
        return mapper.map(users, UserDto.class);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<UserDto> list = new ArrayList<>();
        var users = repo.findAll();
        users.forEach(u-> {
            if(!u.isDeleted())
                list.add(mapper.map(u, UserDto.class));
        });
        return list;
    }

    @Override
    public UserDto getById(int id) {
        var users = repo.findById(id).get();
        if(users.isDeleted()) return null;
        return mapper.map(users, UserDto.class);
    }

    @Override
    public void delete(int id) {
        User u = repo.findById(id).get();
        u.setDeleted(true);
        repo.save(u);
    }

    @Override
    public UserDto update(UserDto userDto) {
        repo.deleteById(userDto.getId());
        return save(userDto);
    }
}
