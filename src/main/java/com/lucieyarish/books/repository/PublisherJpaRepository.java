package com.lucieyarish.books.repository;

import com.lucieyarish.books.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherJpaRepository extends JpaRepository<Publisher, Integer> {
}
