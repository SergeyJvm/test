package com.example.graphql.book.dto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Integer authorId) {
    public static List<Book> books = Arrays.asList(
        new Book(1, "Java Head First", 546,1),
        new Book(2, "Think positive", 320,1),
        new Book(3, "Future", 123,2),
        new Book(4, "Harry Potter", 604,1)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream()
                .filter(book -> book.id.equals(id))
                .findFirst();
    }
}
