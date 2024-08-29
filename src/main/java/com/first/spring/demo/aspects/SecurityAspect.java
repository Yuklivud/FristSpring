package com.first.spring.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("com.first.spring.demo.aspects.Pointcuts.allMethods()")
    public void beforeAllMethods(JoinPoint joinPoint) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(new Date());

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.printf("[%s] [Before, security] Security some logic for method - %s...%n", formattedDate, methodSignature.getMethod().getName());
    }
}
