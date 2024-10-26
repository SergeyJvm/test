package com.example.graphql.book.controller;

import com.example.graphql.book.dto.Author;
import com.example.graphql.book.dto.Book;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class BookController {

    @QueryMapping
    public List<Book> books() {
        log.info("BookController: get all books");
        return Book.books;
    }

    @QueryMapping
    public Optional<Book> bookById(@Argument Integer id) {
        log.info("BookController: get book by id {}", id);
        return Book.getBookById(id);
    }

    @SchemaMapping
    public Optional<Author> author(Book book){
        log.info("BookController: get author {}", book);
        return Author.getAuthorById(book.authorId());
    }
}
