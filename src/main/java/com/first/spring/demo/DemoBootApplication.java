package com.first.spring.demo;

import com.first.spring.demo.beans.aop.Library;
import com.first.spring.demo.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoBootApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Library library = context.getBean("collegeLibrary", Library.class);
        library.getBook();

        Person person = context.getBean("personBean", Person.class);
        person.getAnimal().say();

        context.close();
    }
}
