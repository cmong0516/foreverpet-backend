package com.hello.foreverpet.config;

import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .addOpenApiCustomizer(openApi -> openApi
                        .info(new Info().title("ForeverPet Api")
                                .description("ForeverPet Project API 입니다")
                                .version("v1.0")
                        )
                )
                .build();
    }

}
