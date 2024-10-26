package com.example.graphql.book.dto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id,
                     String name) {
    public static List<Author> authors = Arrays.asList(
            new Author(1, "Tolstoy"),
            new Author(2, "Pushkin")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(author -> author.id.equals(id))
                .findFirst();
    }
}
