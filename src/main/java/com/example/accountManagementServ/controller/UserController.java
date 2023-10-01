package com.example.accountManagementServ.controller;

import com.example.accountManagementServ.model.UserModel;
import com.example.accountManagementServ.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public void createUser(@RequestBody UserModel userModel) {
        userService.createUser(userModel);
    }

    @GetMapping("/")
    public UserModel getUserById(@RequestParam Long id) {
        return userService.getUserById(id);
    }
}
