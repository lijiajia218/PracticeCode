package com.example.springboot2.mapper.serviceTest;

import com.example.springboot2.service.AOPService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Description
 * @Author lll
 * @Date: 2022/7/5 14:02
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AOPTest {

    @Autowired
    AOPService aopService;


    @Test
    public void test() {
        Map<String, String> params = new HashMap(){
            {
                put("id", UUID.randomUUID().toString());
            }
        };
        aopService.testAspect(params) ;
    }
}
