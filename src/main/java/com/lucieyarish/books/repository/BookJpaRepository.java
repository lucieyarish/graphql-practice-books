package com.lucieyarish.books.repository;

import com.lucieyarish.books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookJpaRepository extends JpaRepository<Book, Integer> {
}
