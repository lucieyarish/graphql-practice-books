package com.lucieyarish.books.controller;

import com.lucieyarish.books.model.Book;
import com.lucieyarish.books.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @QueryMapping
    public List<Book> allBooks() {
        return bookService.findAll();
    }

    @QueryMapping
    public Book findOne(@Argument Integer id) {
        return bookService.findOne(id).orElse(null);
    }
}
