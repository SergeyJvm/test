package com.example.graphql.latest.athlete.dto;

public record Run(Long id,
                  String description,
                  int elevation) implements Activity {
}
