package com.example.graphql.athlete.dto;

public record Run(Long id,
                  String description,
                  int elevation) implements Activity {
}
