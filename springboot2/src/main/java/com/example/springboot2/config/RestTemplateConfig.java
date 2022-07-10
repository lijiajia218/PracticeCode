package com.example.springboot2.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.AsyncClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author lll
 * @Date: 2022/7/5 12:38
 * @Version 1.0
 */
@Configuration
public class RestTemplateConfig {

    @Bean(name = "restTemplate")
    public RestTemplate restTemplate(@Qualifier("simpleClientHttpRequestFactory") ClientHttpRequestFactory factory) {
        RestTemplate template = new RestTemplate();
        template.setRequestFactory(factory);
        return template;
    }

    @Bean(name = "asyncRestTemplate")
    public AsyncRestTemplate asyncRestTemplate(@Qualifier("asyncClientHttpRequestFactory") AsyncClientHttpRequestFactory factory) {
        return new AsyncRestTemplate(factory);
    }

    @Bean(name = "simpleClientHttpRequestFactory")
    public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(3000);
        factory.setReadTimeout(15000);
        return factory;
    }

    @Bean(name = "asyncClientHttpRequestFactory")
    public AsyncClientHttpRequestFactory asyncClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(3000);
        factory.setReadTimeout(15000);
        return factory;
    }



}
