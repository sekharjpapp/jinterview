package com.pixel.dependencyinjection.controller;

import com.pixel.dependencyinjection.model.UserRepo;
import com.pixel.dependencyinjection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserRepo> getUsers() {
        return userService.getAllUsers();
    }
}
