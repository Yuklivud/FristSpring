package com.first.spring.demo;

import com.first.spring.demo.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoBootApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("personBean", Person.class);
        person.getAnimal().say();
        System.out.println(person.getName());
        context.close();
    }
}
