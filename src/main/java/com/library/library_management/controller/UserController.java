package com.library.library_management.controller;

import com.library.library_management.model.User;
import com.library.library_management.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/addUser")
    public String addUser(@RequestParam("user") User user){
        userService.addUser(user);
        return "book is added";
    }
    @GetMapping("/updateUser")
    public String updateUser(@RequestParam("user") User user){
        userService.updateUser(user);
        return "book is updated";
    }
    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam("user") User user){
        userService.deleteUser(user);
        return "book is deleted";
    }
    @GetMapping("/getAllUsers")
    List<User> getAllUsers() {
        List<User> users = userService.getAll();
        return users;
    }
//       @GetMapping("/")
//    User getById(@RequestParam("id") Long id){
//           userService.getById(getById);
//           return
//
//        }
//        @GetMapping
//    List<User> getByFirstName(@RequestParam("fName") String fName){
//
//        }
//        @GetMapping
//    List<User> getByLastName((@RequestParam("lName")String lName){
//
//        }
//        @GetMapping
//    List<User> getByCity((@RequestParam("city")String city){
//
//        }
//        @GetMapping
//    List<User> getByStreet((@RequestParam("street") String street){
//
//        }
//        @GetMapping
//    List<User> getByState(@RequestParam("state") String state){
//
//        }
//        @GetMapping
//    List<User> getByZipcode(@RequestParam("zipcode") String zipcode){
//
//        }
//        @GetMapping
//    User getByFnameAndLname(@RequestParam("fName") String fName, @RequestParam("lName") String lName){
//
//        }
//
//    }
}
