package com.example.springboot.Others.Annotation;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @Description 测试：@ConditionalOnProperty 1.name如果没有配置，类是否能实例化取决于matchIfMissing的值
 * 2.name配置了，取决于 name && havingvalue
 * @Author lll
 * @Date: 2022/6/25 14:02
 * @Version 1.0
 */
@ConditionalOnProperty(name = "just.value" ,havingValue ="true" ,matchIfMissing = false)
@Component
public class TestBean implements InitializingBean {

    //获取properties的值
//    @Value("${just.value}")
//    boolean value ;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("这个类实现了吗。。。。。");

    }
}
