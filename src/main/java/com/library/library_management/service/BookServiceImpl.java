package com.library.library_management.service;

import com.library.library_management.model.Book;
import com.library.library_management.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements IBookService {
    @Autowired
    IBookRepository bookRepository;
    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(Book bookId) {
        bookRepository.delete(bookId);
    }

    @Override
    public List<Book> getAll() {
       return bookRepository.findAll();

    }
}
