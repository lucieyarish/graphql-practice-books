package com.lucieyarish.books.service;

import com.lucieyarish.books.model.Book;
import com.lucieyarish.books.repository.BookJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService {

    private final BookJpaRepository bookJpaRepository;

    public List<Book> findAll() {
        return bookJpaRepository.findAll();
    }

    public Optional<Book> findOne(Integer id) {
        return bookJpaRepository.findById(id);
    }
}
