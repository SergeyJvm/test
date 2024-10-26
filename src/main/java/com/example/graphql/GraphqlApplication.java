package com.example.graphql;

import com.example.graphql.latest.club.Club;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.graphql.GraphQlSourceBuilderCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Bean
	GraphQlSourceBuilderCustomizer graphQlSourceBuilderCustomizer() {
		return builder -> {
            builder.inspectSchemaMappings(
                    initializer -> initializer.classMapping("Club", Club.class),
                    e-> log.info("Bean create name: {}", e.toString()));
        };
	}

}
