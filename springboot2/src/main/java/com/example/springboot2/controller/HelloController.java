package com.example.springboot2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        logger.info("just test slf4j ");
        return "hello springboot !";
    }
}
