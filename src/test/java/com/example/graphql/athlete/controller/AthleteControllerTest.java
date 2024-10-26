package com.example.graphql.athlete.controller;

import com.example.graphql.latest.athlete.controller.AthleteController;
import com.example.graphql.latest.athlete.dto.Athlete;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@GraphQlTest(AthleteController.class)
class AthleteControllerTest {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void getAthlete() {
        this.graphQlTester.document("query {athlete(id:10) {id, firstName, lastName}}")
                .execute()
                .path("athlete").entity(Athlete.class).satisfies(athlete -> {
                    assertThat(athlete.id()).isEqualTo(10);
                    assertThat(athlete.firstName()).isEqualTo("June");
                    assertThat(athlete.lastName()).isEqualTo("Holt");
                });
    }
}