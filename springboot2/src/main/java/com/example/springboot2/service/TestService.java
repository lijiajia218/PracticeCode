package com.example.springboot2.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

/**
 * @Description
 * @Author lll
 * @Date: 2022/7/5 13:59
 * @Version 1.0
 */
public class TestService implements InitializingBean {

    //方式一，通过这个方式获取
    @Value("${value}")
    String value ;

    @Autowired
    private Environment environment;


    @Override
    public void afterPropertiesSet() throws Exception {

//        System.out.println(value);
        //方式二：通过这种方式获取。
        System.out.println(environment.getProperty("server.port"));

    }
}
