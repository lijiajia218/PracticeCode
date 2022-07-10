package com.example.springboot2.service;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description
 * @Author lll
 * @Date: 2022/7/5 13:58
 * @Version 1.0
 */

@Component
public class AOPService {


    public String testAspect(Map map){
        return "test return";
    }

}
