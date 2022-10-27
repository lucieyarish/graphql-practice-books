package com.lucieyarish.books.controller;

import com.lucieyarish.books.model.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    @SchemaMapping(typeName = "Query", value = "allBooks") //same as the annotation below
//    public List<Book> findAll() {
//        return bookRepository.findAll();
//    }

    @QueryMapping //derives method's name from our schema file -- the method's name allBooks() and the query in schema (allBooks) must be the same
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    @QueryMapping
    public Book findOne(@Argument Integer id) {
        return bookRepository.findOne(id);
    }
}
