package com.hello.foreverpet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ForeverpetApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForeverpetApplication.class, args);
    }

}
