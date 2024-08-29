package com.first.spring.demo.beans.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary implements Library {
    @Value("Some book")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBookName() {
        return name;
    }

    @Override
    public void getBook() {
        System.out.println("Попытка взять книгу");
    }
}
