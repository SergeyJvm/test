package com.example.graphql.athlete.controller;

import com.example.graphql.athlete.AthleteSource;
import com.example.graphql.athlete.dto.Activity;
import com.example.graphql.athlete.dto.Athlete;
import com.example.graphql.athlete.dto.Comment;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.BatchMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class AthleteController {

    @QueryMapping
    public Athlete athlete(@Argument Long id) {
        log.info("Getting athlete {}", id);
        return AthleteSource.getAthlete(id);
    }

    @BatchMapping
    public List<List<Activity>> activities(List<Athlete> athletes) {
        log.info("Getting activities for {}", athletes);
        return AthleteSource.getActivities(athletes);
    }

    @BatchMapping
    public List<List<Comment>> comments(List<Activity> activities) {
        log.info("Getting comments for {}", activities);
        return AthleteSource.getComments(activities);
    }

}