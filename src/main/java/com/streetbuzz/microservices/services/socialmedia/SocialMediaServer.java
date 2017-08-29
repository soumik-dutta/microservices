package com.streetbuzz.microservices.services.socialmedia;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by duttas16 on 6/19/2017.
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
public class SocialMediaServer {
    public static void main(String[] args) {
        // Tell server to look for accounts-server.properties or
        // web-server.yml
        System.setProperty("spring.config.name", "socialmedia-server");

        SpringApplication.run(SocialMediaServer.class, args);
    }
}
