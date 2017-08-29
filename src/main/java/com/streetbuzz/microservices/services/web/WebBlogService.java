package com.streetbuzz.microservices.services.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

/**
 * Created by duttas16 on 7/3/2017.
 */
@Slf4j
public class WebBlogService {


    @Autowired
    @LoadBalanced
    protected RestTemplate restTemplate;

    protected String serviceUrl;

    /**
     * Constructor to set the service url for the Blogs
     * @param serviceUrl
     */
    public WebBlogService(String serviceUrl) {
        log.info("Setting service URL from Blog");
        this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
                : "http://" + serviceUrl;
    }

    /**
     * The RestTemplate works because it uses a custom request-factory that uses
     * Ribbon to look-up the service to use. This method simply exists to show
     * this.
     */
    @PostConstruct
    public void demoOnly() {
        // Can't do this in the constructor because the RestTemplate injection
        // happens afterwards.
        log.warn("The RestTemplate request factory is "
                + restTemplate.getRequestFactory().getClass());
    }



    public void create(){
        log.info(this.toString()+" blog microservice called ");
        restTemplate.headForHeaders(serviceUrl + "/blog/create");
    }


    @Override
    public String toString() {
        return "com.streetbuzz.microservices.services.web.WebBlogService : ";
    }
}
