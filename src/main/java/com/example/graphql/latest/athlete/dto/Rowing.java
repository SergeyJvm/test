package com.example.graphql.latest.athlete.dto;

public record Rowing(Long id,
                     String description,
                     int split) implements Activity {
}
