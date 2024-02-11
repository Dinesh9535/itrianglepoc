package com.poc.itriangleMob.controller;

// AuthController.java
import com.poc.itriangleMob.model.User;
import com.poc.itriangleMob.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.AuthenticationException;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
//        return null;
        return userService.signup(user);
    }

    @PostMapping("/signin")
    public User signin(@RequestBody User user) throws AuthenticationException {
//        return null;
        return userService.signin(user.getUsername(), user.getPassword());
    }
}