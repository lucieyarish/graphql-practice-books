package com.lucieyarish.books.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@Table(name = "book")
@Entity
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "book_description")
    private String bookDescription;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "total_pages")
    private Integer totalPages;

    @Column(name = "published_date")
    private Integer publishedData;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
}
