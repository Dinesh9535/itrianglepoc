package com.poc.itriangleMob.service;

// UserService.java


import com.poc.itriangleMob.model.User;

import javax.naming.AuthenticationException;

public interface UserService {
    User signup(User user);

    User signin(String username, String password) throws AuthenticationException;

    User getUserByUsername(String username);

}