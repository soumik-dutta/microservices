package com.streetbuzz.microservices.services.blogs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Microservice controller
 * Created by duttas16 on 6/29/2017.
 */

@Slf4j
@RestController
@RequestMapping("blog")
public class BlogServiceController  {


    @Override
    public String toString() {
        return "com.streetbuzz.microservices.services.blogs.BlogServiceController : ";
    }

    @RequestMapping(
            value = "/create",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void createBlog( HttpServletResponse response) {
        log.info(this.toString()+"creating Blogs ");

    }
}
