package com.first.spring.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.first.spring.demo.beans", "com.first.spring.demo.aspects"})
@PropertySource("classpath:myApp.properties")
public class AppConfig {
}
