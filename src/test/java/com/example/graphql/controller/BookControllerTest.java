package com.example.graphql.controller;

import com.example.graphql.dto.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.test.tester.GraphQlTester;
import static org.junit.jupiter.api.Assertions.*;

@GraphQlTest(BookController.class)
class BookControllerTest {

    @Autowired
    GraphQlTester graphQlTester;

    @Test
    void canGetBooks() {
        graphQlTester
                .documentName("books")
                .execute()
                .path("books")
                .entityList(Book.class)
                .hasSize(4);
    }
}