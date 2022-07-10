package com.li.bean;/**
 * @description:
 * @author: lll
 * @date: 2022-05-21 11:32
 */

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

/**
 *@Author sqb
 *@Date 11:32
 */
@Data
public abstract class User implements InitializingBean {
    
    private String name ;
    private int age;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("test");
    }



}
