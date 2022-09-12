package com.stephen.libraryservice.controller;

import com.stephen.libraryservice.api.LibraryApi;

import com.stephen.libraryservice.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController implements LibraryApi {

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        List<Book> books = new ArrayList<>();

        Book book = new Book();
        book.setName("Harry Potter");
        book.setBookAuthor("JK Rowling");

        Book book1 = new Book();
        book1.setName("The Hobbit");
        book1.setBookAuthor("JRR Tolkien");

        Book book2 = new Book();
        book2.setName("Matilda");
        book2.setBookAuthor("Roald Dahl");

        books.add(book);
        books.add(book1);
        books.add(book2);

        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
