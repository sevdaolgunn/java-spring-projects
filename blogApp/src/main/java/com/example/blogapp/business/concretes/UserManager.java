package com.example.blogapp.business.concretes;

import com.example.blogapp.business.abstarct.UserService;
import com.example.blogapp.entity.User;
import com.example.blogapp.repository.UserRepository;
import com.example.blogapp.request.UserCreateRequest;
import com.example.blogapp.request.UserUpdateRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Getter
@Setter
@RequiredArgsConstructor

public class UserManager implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()){
            return user.get();
        }
        return null;
    }

    @Override
    public User createUser(UserCreateRequest request) {
        User user = new User();

        user.setName(request.getName());
        user.setMail(request.getMail());
        user.setPassword(request.getPassword());

        return userRepository.save(user);
    }

    @Override
    public User updateUser(int id, UserUpdateRequest request) {
        Optional<User> user =  userRepository.findById(id);


        if (user.isPresent()){
            user.get().setId(id);
            user.get().setName(user.get().getName());
            user.get().setMail(user.get().getMail());
            user.get().setPassword(user.get().getPassword());

            return userRepository.save(user.get());
        }
        return null;
    }

    @Override
    public void deleteUser(int id) {
        if (userRepository.findById(id).isPresent()){
            userRepository.deleteById(id);
        }

    }
}
