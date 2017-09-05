package com.streetbuzz.config.git;


import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;


@EnableConfigServer
@SpringBootApplication
public class ConfigServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "config-server");

        SpringApplication.run(Application.class, args);
    }
}
