package com.library.library_management.service;

import com.library.library_management.model.Book;
import com.library.library_management.model.User;

import java.util.List;

public interface IUserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User userId);
    List<User> getAll();
}
