package com.library.library_management.controller;

import com.library.library_management.model.Book;
import com.library.library_management.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    BookServiceImpl bookService;

    @GetMapping("/addBook")
    public String addBook(Book book){
        bookService.addBook(book);
        return "book is added";
    }
    @GetMapping("/updateBook")
    public String updateBook(@RequestParam("book") Book book){
        bookService.updateBook(book);
        return "book is updated";
    }
    @GetMapping("/deleteBook")
    public String deleteBook(@RequestParam("bookID") Book bookId){
        bookService.deleteBook(bookId);
        return "book is deleted";
    }
    @GetMapping("/getAll")
    List<Book>books(){
       List<Book> books= bookService.getAll();
       return books;
    }
}
