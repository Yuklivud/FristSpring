package com.first.spring.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Pointcuts {
    @Pointcut("execution(* get*())")
    public void allMethodsFromClass() {}

    @Pointcut("execution(* com.first.spring.demo.beans.aop.CollegeLibrary.get*(..))")
    public void allMethodsFromCollegeLibrary(){}

    @Pointcut("execution(* com.first.spring.demo.beans.aop.SchoolLibrary.*(..))")
    public void allMethodsFromSchoolLibrary(){}

    @Pointcut("execution(* *(..))")
    public void allMethods(){}
}
