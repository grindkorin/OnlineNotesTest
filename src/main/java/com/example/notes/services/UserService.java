package com.example.notes.services;

import com.example.notes.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User save(User user);
    User getById(Integer id);
    List<User> saveAll(List<User> users);
}
