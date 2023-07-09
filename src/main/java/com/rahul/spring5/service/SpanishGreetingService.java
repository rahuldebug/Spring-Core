package com.rahul.spring5.service;

import org.springframework.stereotype.Service;

@Service
public class SpanishGreetingService implements GreetingService{
    @Override
    public String greet() {
        return "holla amigos";
    }
}
