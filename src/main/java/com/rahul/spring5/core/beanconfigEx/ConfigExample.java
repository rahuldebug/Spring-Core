package com.rahul.spring5.core.beanconfigEx;

import org.springframework.stereotype.Component;

//@Component
//if we uncomment above line , the application start will fail
//because instead of autoconfiguration (where default constructor is created)
//we are using parameterized constructor which needs @Configuration and @Bean instantiation
public class ConfigExample {
    String name;
    Integer id;

    ConfigExample(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
}
