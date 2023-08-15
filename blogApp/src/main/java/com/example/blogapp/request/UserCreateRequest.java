package com.example.blogapp.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserCreateRequest {
    private String name;
    private String mail;
    private String password;

}
