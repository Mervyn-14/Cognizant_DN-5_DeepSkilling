package com.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.library.Book;
import com.library.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository repository;
    @GetMapping
    public List<Book> getAllBooks() {
        return repository.findAll();
    }
    @PostMapping
    public Book addBook(
            @RequestBody Book book) {

        return repository.save(book);
    }
}