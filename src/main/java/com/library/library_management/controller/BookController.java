package com.library.library_management.controller;

import com.library.library_management.model.Book;
import com.library.library_management.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api")
public class BookController {
        BookServiceImpl bookService;

        public BookController(BookServiceImpl bookService) {
            this.bookService = bookService;
        }

        @RequestMapping(value = "/hello")
        public String helloWorld(@ModelAttribute Book book) {
            return "result";
        }

        @RequestMapping("/addBook")
        public String addBook(Book book) {
            bookService.addBook(book);
            return "admin";
        }

        @GetMapping("/updateBook")
        public String updateBook(@RequestParam("book") Book book) {
            bookService.updateBook(book);
            return "admin";
        }

        @GetMapping("/deleteBook")
        public String deleteBook(@RequestParam("bookID") Book bookId) {
            bookService.deleteBook(bookId);
            return "admin";
        }
//    @GetMapping("/getAll")
//    List<Book>books(MOD) {
//        List<Book> books = bookService.getAll();
//        return "home";
//    }
//        @GetMapping()
//        String getById(@RequestParam("bookId") Long bookId){
//             bookService.getById(bookId);
//             return "home";
//        }
//        @GetMapping()
//        List<Book> getByName(@RequestParam("name") String name){
//            bookService.getByName(name);
//            return "home";
//        }
//        @GetMapping()
//        List<Book> getByNameAndEdition(@RequestParam("name") String name,@RequestParam("edition") String edition){
//            bookService.getByNameAndEdition(name,edition);
//            return "home";
//        }
//        @GetMapping()
//        List<Book> getByGenre(@RequestParam("genre") String genre){
//            bookService.getByGenre(genre);
//            return "home";
//        }
//
    }

