package koza.dev.firstspringproject.controller;

import koza.dev.firstspringproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
@RequiredArgsConstructor
public class ServiceController {

    private final UserService userService;

    @PostMapping("create")
    private void createUser(@RequestParam String name){
        userService.createUser(name);

    }


}
