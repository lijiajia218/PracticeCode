package com.example.springboot2.intercepter;/**
 * @Description
 * @Author lll
 * @Date: 2022/7/5 12:58
 * @Version 1.0
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * service 层方法执行时的出入参打印
 * @author xiaodongli
 * @date 2019-09-12 11:08
 */
@Slf4j
@Aspect
@Component
public class ServiceLogAspect {

    private final ObjectMapper objectMapper = new ObjectMapper();
    public ServiceLogAspect() {
    }

    /**
     * 声明切入点
     */
    @Pointcut("execution(public * com.example.springboot2.service.*.*(..))")
    private void servicePointCut() {
    }

    /**
     * 执行方法前：先打印入参
     */
    @SneakyThrows
    @Before(value = "servicePointCut()")
    public void methodBefore(JoinPoint joinPoint) {
        log.info("request: {\"threadId\":{}, \"methodName\":\"{}\", \"args\": {}}", Thread.currentThread().getId(), joinPoint.getSignature().getDeclaringTypeName() + "#" + joinPoint.getSignature().getName(), objectMapper.writeValueAsString(joinPoint.getArgs()));
    }

    /**
     * 方法执行返回前：打印出参
     */
    @SneakyThrows
    @AfterReturning(pointcut = "servicePointCut()", returning = "returnObject")
    public void methodAfterReturning(JoinPoint joinPoint, Object returnObject) {
        log.info("response: {\"threadId\":{}, \"methodName\":\"{}\", \"args\": {}}", Thread.currentThread().getId(), joinPoint.getSignature().getDeclaringTypeName() + "#" + joinPoint.getSignature().getName(), objectMapper.writeValueAsString(returnObject));
    }
}