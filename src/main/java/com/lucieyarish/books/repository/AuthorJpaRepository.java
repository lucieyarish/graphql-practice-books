package com.lucieyarish.books.repository;

import com.lucieyarish.books.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorJpaRepository extends JpaRepository<Author, Integer> {
}
