package com.streetbuzz.microservices.services.web;

import com.streetbuzz.microservices.utils.NamingServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * Implements NamingServer to get the service details from the constants
 * Created by duttas16 on 6/19/2017.
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false)
public class WebServer implements NamingServer {


    /**
     * A customized RestTemplate that has the ribbon load balancer build in.
     * Note that prior to the "Brixton"
     *
     * @return
     */
    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args) {
        // Tell server to look for accounts-server.properties or
        // web-server.yml
        System.setProperty("spring.config.name", "web-server");

        SpringApplication.run(WebServer.class, args);
    }

    /**
     * The AccountService encapsulates the interaction with the micro-service.
     *
     * @return A new service instance.
     */
    @Bean
    public WebBlogService webBlogService() {
        WebBlogService webBlogService= new WebBlogService(BLOG_SERVICE_URL);
        log.info("Web Blog service : "+webBlogService.serviceUrl);
        return webBlogService;
    }


    /**
     * Create the controller, passing it the {@link WebBlogService} to use.
     *
     * @return
     */
    @Bean
    public WebBlogController accountsController() {
        return new WebBlogController(webBlogService());
    }

    @Bean
    public WebController homeController() {
        return new WebController();
    }
}
