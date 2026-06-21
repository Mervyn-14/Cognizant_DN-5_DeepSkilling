package com.library;
import com.library.BookRepository;
public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void displayService() {
        System.out.println("Book Service Running...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
}