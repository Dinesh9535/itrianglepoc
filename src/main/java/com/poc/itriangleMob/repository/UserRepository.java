package com.poc.itriangleMob.repository;

// UserRepository.java

import com.poc.itriangleMob.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}