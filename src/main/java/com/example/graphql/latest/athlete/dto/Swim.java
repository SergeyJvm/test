package com.example.graphql.latest.athlete.dto;

public record Swim(Long id,
                   String description,
                   int laps,
                   boolean indoor) implements Activity {
}
