package com.example.graphql.athlete.dto;

public record Swim(Long id,
                   String description,
                   int laps,
                   boolean indoor) implements Activity {
}
