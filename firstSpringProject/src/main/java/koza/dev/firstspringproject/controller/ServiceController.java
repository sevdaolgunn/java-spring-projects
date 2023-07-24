package koza.dev.firstspringproject.controller;

import koza.dev.firstspringproject.entity.User;
import koza.dev.firstspringproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class ServiceController {

    private final UserService userService;

    @PostMapping
    private void createUser(@RequestParam String name,String surname){
        userService.createUser(name, surname);
    }

    @GetMapping("/{userId}")
    private User getUser(@PathVariable Integer userId){
        return userService.getUser(userId);
    }

    @DeleteMapping("/{userId}")
    private void deleteUser(@PathVariable Integer userId){
        userService.deleteUser(userId);
    }


}
