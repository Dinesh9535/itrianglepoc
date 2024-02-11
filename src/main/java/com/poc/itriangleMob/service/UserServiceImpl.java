package com.poc.itriangleMob.service;

// UserServiceImpl.java

import com.poc.itriangleMob.model.User;
import com.poc.itriangleMob.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public User signup(User user) {
        // Encrypt password before saving
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setPassword(user.getPassword());
        return userRepository.save(user);
    }

    @Override
    public User signin(String username, String password) throws AuthenticationException {
        User user = userRepository.findByUsername(username);
//        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
        if (user != null && Objects.equals(password, user.getPassword())) {
            return user;
        }
        throw new AuthenticationException("401");
      //  return null; // or throw an exception for invalid credentials
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}