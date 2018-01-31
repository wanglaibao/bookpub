package com.laibao.bookpub.controller;

import com.laibao.bookpub.entity.Book;
import com.laibao.bookpub.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;


    @GetMapping
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }


    @GetMapping("/{isbn}")
    public Book getBook(@PathVariable String isbn) {
        return bookRepository.findBookByIsbn(isbn);
    }

}
