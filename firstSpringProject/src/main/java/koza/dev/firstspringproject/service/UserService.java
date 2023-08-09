package koza.dev.firstspringproject.service;

import koza.dev.firstspringproject.converter.UserConverter;
import koza.dev.firstspringproject.dto.UserDto;
import koza.dev.firstspringproject.entity.User;
import koza.dev.firstspringproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserConverter userConverter;

    public void createUser(String name, String surname){
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        repository.save(user);

    }

    public UserDto getUser(Integer userId) {
        Optional<User> optionalUser = repository.findById(userId);
        return UserDto.builder()
                .id(optionalUser.get().getId())
                .name(optionalUser.get().getName())
                .surname(optionalUser.get().getSurname())
                .build();
    }

    public List<UserDto> getAllUser() {
        List<User> users = repository.findAll();// user obje listesi
        List<UserDto> userDtoList = new ArrayList<>();

        for (User user : users){
            userDtoList.add(userConverter.convertAsDto(user));
        }
        return userDtoList;// user dto obje listesi

    }

    public void updateUser(Integer userId,String name, String surname){
        User user = repository.findById(userId).get();
        user.setName(name);
        user.setSurname(surname);
        repository.save(user);
    }

    public void deleteUser(Integer userId){
        User user = repository.findById(userId).get();
        repository.delete(user);
    }
}
