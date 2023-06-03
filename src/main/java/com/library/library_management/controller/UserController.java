package com.library.library_management.controller;

import com.library.library_management.model.User;
import com.library.library_management.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "book is added";
    }
    @GetMapping("/updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "book is updated";
    }
    @GetMapping("/deleteUser")
    public String deleteUser(User user){
        userService.deleteUser(user);
        return "book is deleted";
    }
    @GetMapping("/getAllUsers")
    List<User> getAllUsers(){
        List<User>users=userService.getAll();
        return users;
    }
}
