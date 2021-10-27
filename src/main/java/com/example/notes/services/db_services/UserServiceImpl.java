package com.example.notes.services.db_services;

import com.example.notes.models.User;
import com.example.notes.repository.UserRepository;
import com.example.notes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User getById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public List<User> saveAll(List<User> users) {
        return repository.saveAll(users);
    }
}
