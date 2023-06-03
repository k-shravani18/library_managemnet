package com.library.library_management.service;

import com.library.library_management.model.Book;

import java.util.List;

public interface IBookService {
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(Book bookId);
    List<Book>getAll();
}
