package com.library.library_management.service;

import com.library.library_management.model.Book;
import com.library.library_management.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IUserService {
    //crud operarions
    String addUser(User user);
    String updateUser(User user);
    String deleteUser(User user);
    List<User> getAll();
    User getById(Long id);
//
//    //custom operations
//    List<User> getByFirstName(String fName);
//    List<User> getByLastName(String lName);
//    List<User> getByCity(String city);
//    List<User> getByStreet(String street);
//    List<User> getByState(String state);
//    List<User> getByZipcode(String zipcode);
//    User getByFnameAndLname(String fName, String lName);


}
