package com.streetbuzz.microservices.services.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by duttas16 on 6/30/2017.
 */

@Slf4j
@Controller
public class WebController {
    @RequestMapping("/")
    public String home() {
        log.info("Default selection");
        return "index";
    }
}
