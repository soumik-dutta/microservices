package com.streetbuzz.microservices.services.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by duttas16 on 7/3/2017.
 */

@Slf4j
@RestController
@RequestMapping("/blog")
public class WebBlogController {

    @Autowired
    protected WebBlogService blogService;



    public WebBlogController(WebBlogService blogService) {
        this.blogService = blogService;
    }

    @RequestMapping(
            value = "/create",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void createBlog(){
        //call internal blog controller
        log.info("Internal blog services called");
        blogService.create();

    }

}
