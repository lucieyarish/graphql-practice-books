package com.lucieyarish.books.service;

import com.lucieyarish.books.model.Author;
import com.lucieyarish.books.repository.AuthorJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorJpaRepository authorJpaRepository;

    public List<Author> findAll() {
        return authorJpaRepository.findAll();
    }

    public Optional<Author> findById(Integer id) {
        return authorJpaRepository.findById(id);
    }
}
