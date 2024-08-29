package com.first.spring.demo.beans;

import com.first.spring.demo.beans.animals.Animal;
import com.first.spring.demo.beans.aop.Library;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Animal animal;
    private Library library;
    @Value("${person.name}")
    private String name;

    @Autowired
    @Qualifier("catBean")
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Library getLibrary() {
        return library;
    }
    @Autowired
    @Qualifier("collegeLibrary")
    public void setLibrary(Library library) {
        this.library = library;
    }

    @PostConstruct
    public void init(){
        System.out.println("Some init logic");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Some destroy logic");
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
