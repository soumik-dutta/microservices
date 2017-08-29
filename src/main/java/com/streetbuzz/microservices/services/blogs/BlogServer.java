package com.streetbuzz.microservices.services.blogs;

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
public class BlogServer {
    public static void main(String[] args) {
        // Tell server to look for registration.properties or registration-server.yml
        System.setProperty("spring.config.name", "blog-server");
        //start spring boot service
        SpringApplication.run(BlogServer.class, args);
    }
}
