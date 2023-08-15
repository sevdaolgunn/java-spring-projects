package com.example.blogapp.business.abstarct;

import com.example.blogapp.entity.User;
import com.example.blogapp.request.UserCreateRequest;
import com.example.blogapp.request.UserUpdateRequest;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUser(int id);
    User createUser(UserCreateRequest request);
    User updateUser(int id, UserUpdateRequest request);
    void deleteUser(int id);
}
