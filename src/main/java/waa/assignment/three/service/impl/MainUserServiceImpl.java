package waa.assignment.three.service.impl;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import waa.assignment.three.dto.MainUserDto;
import waa.assignment.three.entity.Address;
import waa.assignment.three.entity.MainUser;
import waa.assignment.three.repository.MainUserRepository;
import waa.assignment.three.service.MainUserService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
@RequiredArgsConstructor

public class MainUserServiceImpl implements MainUserService {

    private final MainUserRepository userRepository;
    private final ModelMapper modelMapper;


    public List<MainUserDto> getUsers() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false)
                .map(user -> modelMapper.map(user, MainUserDto.class)).collect(Collectors.toList());
    }

    public void saveUser(MainUserDto user) {
        userRepository.save(modelMapper.map(user, MainUser.class));

    }

    public MainUserDto getUser(long id) {
        return modelMapper.map(userRepository.findById(id).get(), MainUserDto.class);
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    public void updateUser(long id, MainUserDto userDto) {
        MainUser user = userRepository.findById(id).get();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setAddress(modelMapper.map(userDto.getAddress(), Address.class));
        userRepository.save(user);
    }

}
