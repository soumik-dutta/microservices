package com.streetbuzz.microservices.services.external;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by duttas16 on 6/19/2017.
 */

@SpringBootApplication
@EnableEurekaClient
public class ExternalServer {
    public static void main(String[] args) {
        // Tell server to look for registration.properties or registration-server.yml
        System.setProperty("spring.config.name", "external-server");
        //start spring boot service
        SpringApplication.run(ExternalServer.class, args);
    }
}
