package com.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public void displayService() {
        System.out.println("BookService Bean Loaded");
        bookRepository.displayRepository();
    }
}