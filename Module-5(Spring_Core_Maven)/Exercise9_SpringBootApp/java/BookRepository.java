package com.library;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.Book;

public interface BookRepository
        extends JpaRepository<Book, Long> {

}