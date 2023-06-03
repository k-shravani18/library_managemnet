package com.library.library_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }
    @RequestMapping("/addForm")
    public String showAddForm() {
        return "addBookForm";
    }
    @RequestMapping("/deleteForm")
    public String showDeleteForm() {
        return "deleteBookForm";
    }
    @RequestMapping("/editForm")
    public String showUpdateForm() {
        return "updateBookForm";
    }
}
