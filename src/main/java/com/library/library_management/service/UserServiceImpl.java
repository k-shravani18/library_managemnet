package com.library.library_management.service;

import com.library.library_management.model.User;
import com.library.library_management.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(User userId) {
        userRepository.delete(userId);
    }

    @Override
    public List<User> getAll() {
        List<User> users=userRepository.findAll();
        return users;
    }
}
