package com.library.library_management.repository;

import com.library.library_management.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface IBookRepository extends JpaRepository<Book,Long> {
    //        List<Book> findByName(String name);
//        List<Book> findByNameAndEdition(String name,String edition);
//        List<Book> findByGenre(String genre);
//        List<Book> findByPrice(Double price);
//        List<Book> findByPages(Long pages);
//        List<Book> findByUserId(Long user_id);

}
