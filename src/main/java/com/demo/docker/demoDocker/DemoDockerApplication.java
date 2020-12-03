package com.demo.docker.demoDocker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoDockerApplication {

    @Value(value = "${scheduler.interval}")
    String string;

    public static void main(String[] args) {
        SpringApplication.run(DemoDockerApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {
        return args -> {
            System.err.println(string);
        };
    }

}
