package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    @Transactional
    List<User> findAll();

    @Transactional
    User findById(Long id);

    @Transactional
    void save(User user);

    @Transactional
    void update(Long id, User updatedUser);

    @Transactional
    void delete(Long id);

}
