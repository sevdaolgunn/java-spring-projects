package koza.dev.firstspringproject.controller;

import koza.dev.firstspringproject.dto.UserDto;
import koza.dev.firstspringproject.entity.User;
import koza.dev.firstspringproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    private void createUser(@RequestParam String name, @RequestParam String surname){
        userService.createUser(name, surname);
    }

    @GetMapping("/{userId}")
    private UserDto getUser(@PathVariable Integer userId){
        return userService.getUser(userId);
    }

    @GetMapping
    private List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("/{userId}")
    private void updateUser(@PathVariable Integer userId, @RequestParam String name, @RequestParam String surname){
        userService.updateUser(userId,name,surname);


    }

    @DeleteMapping("/{userId}")
    private void deleteUser(@PathVariable Integer userId){
        userService.deleteUser(userId);
    }


}
