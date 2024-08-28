package com.first.spring.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Animal{
    @Value("${animal.name}")
    private String name;
    @Override
    public void say() {
        System.out.println("Wof wof wof");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
