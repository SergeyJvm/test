package com.example.graphql.controller;

import com.example.graphql.dto.Author;
import com.example.graphql.dto.Book;
import java.util.List;
import java.util.Optional;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @QueryMapping
    public List<Book> books() {
        return Book.books;
    }

    @QueryMapping
    public Optional<Book> bookById(@Argument Integer id) {
        return Book.getBookById(id);
    }

    @SchemaMapping
    public Optional<Author> author(Book book){
        return Author.getAuthorById(book.id());
    }
}
