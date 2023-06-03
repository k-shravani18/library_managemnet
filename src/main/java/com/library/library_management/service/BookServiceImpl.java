package com.library.library_management.service;

import com.library.library_management.exceptions.BookAlreadyExistedException;
import com.library.library_management.exceptions.BookNotFoundException;
import com.library.library_management.model.Book;
import com.library.library_management.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements IBookService {
    @Autowired
    IBookRepository bookRepository;


    @Override
    public String addBook(Book book) {
        Book existBook =bookRepository.findById(book.getId()).orElse(null);
        if (existBook==null){
            bookRepository.save(book);
            return "Book added successfully";
        }else {
            throw new BookAlreadyExistedException("this Book already exists");
        }
    }

    @Override
    public String updateBook(Book book) {
        Book existBook =bookRepository.findById(book.getId()).orElse(null);
        if (existBook==null){
            throw new BookNotFoundException("Book Not Found");

        }else {
            bookRepository.save(existBook);
            return "Book deleted successfully";
        }
    }

    @Override
    public String deleteBook(Book book) {
        Book existBook =bookRepository.findById(book.getId()).orElse(null);
        if (existBook==null){
            throw new BookNotFoundException("Book Not Found");

        }else {
            bookRepository.delete(existBook);
            return "Book Deleted successfully";
        }
    }

    @Override
    public Book getById(Long bookId) {
        return bookRepository.findById(bookId).orElseThrow(
                ()-> new BookNotFoundException("Book Not Found "+bookId)
        );
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();

    }

//    @Override
//    public List<Book> getByName(String name) {
//         List<Book> existBook= bookRepository.findByName(name);
//         if (existBook==null){
//             throw new BookNotFoundException("Book Not Found With this Name");
//         }else {
//             return existBook;
//         }
//
//    }

//    @Override
//    public List<Book> getByNameAndEdition(String name,String edition) {
//       List<Book> existBook = bookRepository.findByNameAndEdition(name, edition);
//        if (existBook == null) {
//            throw new BookNotFoundException("Book Not Found With this Name and Edition");
//        } else {
//            return existBook;
//        }
//
//    }
//
//    @Override
//    public List<Book> getByGenre(String genre) {
//        List<Book> existBook= bookRepository.findByGenre(genre);
//        if (existBook==null){
//            throw new BookNotFoundException("Book Not Found With this genre");
//        }else {
//            return existBook;
//        }
//    }
//
//    @Override
//    public List<Book> getByPrice(Double price) {
//        List<Book> existBook= bookRepository.findByPrice(price);
//        if (existBook==null){
//            throw new BookNotFoundException("The price with the Book Not Found ");
//        }else {
//            return existBook;
//        }
//    }
//
//    @Override
//    public List<Book> getByPages(Long pages) {
//        List<Book> existBook= bookRepository.findByPages(pages);
//        if (existBook==null){
//            throw new BookNotFoundException("Book Not Found With this no of pages");
//        }else {
//            return existBook;
//        }
//    }

//    @Override
//    public List<Book> getByUserId(Long user_id) {
//        List<Book> existBook= bookRepository.findByUserId(user_id);
//        if (existBook==null){
//            throw new BookNotFoundException("Book Not Found With this userId");
//        }else {
//            return existBook;
//        }
//    }
}