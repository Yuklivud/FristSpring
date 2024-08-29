package com.first.spring.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("com.first.spring.demo.aspects.Pointcuts.allMethodsFromCollegeLibrary()")
    public void beforeAllGetCollegeLibraryAdvice() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(new Date());

        System.out.printf("[%s] [Before, logging] Logging some information about the college library...%n", formattedDate);
    }
}
