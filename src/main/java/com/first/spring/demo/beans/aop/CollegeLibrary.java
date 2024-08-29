package com.first.spring.demo.beans.aop;

import org.springframework.stereotype.Component;

@Component("collegeLibrary")
public class CollegeLibrary implements Library {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBookName() {
        return name;
    }
    @Override
    public void getBook(){
        System.out.println("Trying pick up a book...");
    }
}
