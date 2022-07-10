package com.example.springboot.interceptor;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@Author lll
 *@Date 23:18
 */
@Configuration
public class InterceptorConfig {

    public static final String traceExecution = "execution(* com.example.springboot.controller..*.*(..))";
    @Bean
    public DefaultPointcutAdvisor defaultPointcutAdvisor2() {
        MyInterceptor interceptor = new MyInterceptor();
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(traceExecution);

        // 配置增强类advisor
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setPointcut(pointcut);
        advisor.setAdvice(interceptor);
        return advisor;
    }
}
