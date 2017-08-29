package com.streetbuzz.microservices.services.internal;


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
public class InternalServer {
    public static void main(String[] args) {
//        log.info("Internal service starting...");
        // Tell server to look for registration.properties or registration-server.yml
        System.setProperty("spring.config.name", "internal-server");
        //start spring boot service
        SpringApplication.run(InternalServer.class, args);
    }
}
