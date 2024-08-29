package com.first.spring.demo.beans.animals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Animal {
    @Value("${animal.name}")
    private String name;

    @Override
    public void say() {
        System.out.println("Meow meow meow meow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
