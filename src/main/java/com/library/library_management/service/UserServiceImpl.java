package com.library.library_management.service;

import com.library.library_management.exceptions.BookNotFoundException;
import com.library.library_management.exceptions.UserAlreadyExistedException;
import com.library.library_management.exceptions.UserNotFoundException;
import com.library.library_management.model.User;
import com.library.library_management.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository userRepository;

    @Override
    public String addUser(User user) {
        User existBook =userRepository.findById(user.getUserId()).orElse(null);
        if (existBook==null){
            userRepository.save(user);
            return "User registered successfully";
        }else {
            throw new UserAlreadyExistedException("this User already exists");
        }
    }

    @Override
    public String updateUser(User user) {
        User existUser =userRepository.findById(user.getUserId()).orElse(null);
        if (existUser==null){
            throw new UserNotFoundException("User Not Found");

        }else {
            userRepository.save(existUser);
            return "User updated successfully";
        }
    }

    @Override
    public String deleteUser(User user) {
        User existUser =userRepository.findById(user.getUserId()).orElse(null);
        if (existUser==null){
            throw new BookNotFoundException("User Not Found");

        }else {
            userRepository.delete(existUser);
            return "User Removed successfully";
        }
    }

    @Override
    public List<User> getAll() {
        List<User> users=userRepository.findAll();
        return users;
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElseThrow(
                ()-> new UserNotFoundException("User Not Found "+id)
        );
    }

//    @Override
//    public List<User> getByFirstName(String fName) {
//        List<User> existUser= userRepository.findByFirstName(fName);
//        if (existUser==null){
//            throw new UserNotFoundException("User Not Found With this First Name");
//        }else {
//            return existUser;
//        }
//    }
//
//    @Override
//    public List<User> getByLastName(String lName) {
//        List<User> existUser= userRepository.findByLastName(lName);
//        if (existUser==null){
//            throw new UserNotFoundException("User Not Found With this Last Name");
//        }else {
//            return existUser;
//        }
//    }
//
//    @Override
//    public List<User> getByCity(String city) {
//        List<User> existUser= userRepository.findByCity(city);
//        if (existUser==null){
//            throw new UserNotFoundException("User Not Found With this City");
//        }else {
//            return existUser;
//        }
//    }
//
//    @Override
//    public List<User> getByStreet(String street) {
//        List<User> existUser= userRepository.findByStreet(street);
//        if (existUser==null){
//            throw new UserNotFoundException("User Not Found With this Street");
//        }else {
//            return existUser;
//        }
//    }
//
//    @Override
//    public List<User> getByState(String state) {
//        List<User> existUser= userRepository.findByState(state);
//        if (existUser==null){
//            throw new UserNotFoundException("User Not Found With this State");
//        }else {
//            return existUser;
//        }
//    }
//
//    @Override
//    public List<User> getByZipcode(String zipcode) {
//        List<User> existUser= userRepository.findByZipcode(zipcode);
//        if (existUser==null){
//            throw new UserNotFoundException("User Not Found With this Zipcode");
//        }else {
//            return existUser;
//        }
//    }
//
//    @Override
//    public User getByFnameAndLname(String fName, String lName) {
//        User existUser = userRepository.findByFnameAndLname(fName,lName);
//        if (existUser == null) {
//            throw new BookNotFoundException("User Not Found With this FirstName and LastName");
//        } else {
//            return existUser;
//        }
//    }
//

}
