package com.example.graphql.latest.search;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class SearchController {

    @QueryMapping
    List<Object> search(@Argument String text) {
        log.info("Searching for '{}'", text);
        return SearchSource.search(text);
    }

}
