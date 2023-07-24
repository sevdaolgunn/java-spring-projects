package koza.dev.firstspringproject.service;

import koza.dev.firstspringproject.entity.User;
import koza.dev.firstspringproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public void createUser(String name){
        User user = new User();
        user.setName(name);
        repository.save(user);

    }

    public User getUser(Integer userId) {
        return repository.findById(userId).get();
    }

    public void deleteUser(Integer userId){
        User user = repository.findById(userId).get();
        repository.delete(user);
    }
}
