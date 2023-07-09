package com.rahul.spring5.service;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingsService implements GreetingService{
    @Override
    public String greet() {
        return "hello everyone";
    }
}
