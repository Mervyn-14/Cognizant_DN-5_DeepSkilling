package com.library;

import com.library.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void displayService() {
        System.out.println("BookService Bean Loaded");
        System.out.println("BookRepository Injected Successfully: "
                + bookRepository);
    }
}