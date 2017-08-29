package com.streetbuzz.microservices.services.registration;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by duttas16 on 6/21/2017.
 *
 * @author Soumik Dutta
 */

@SpringBootApplication
@EnableEurekaServer
public class RegistrationServer {
    public static void main(String[] args) {


        // Tell server to look for registration-service.properties or registration-server.yml
       System.setProperty("spring.config.name", "registration-server");


        SpringApplication.run(RegistrationServer.class, args);
    }
}
