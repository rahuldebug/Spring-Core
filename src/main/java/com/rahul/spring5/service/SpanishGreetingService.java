package com.rahul.spring5.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("ES")
@Service("i8nService")
public class SpanishGreetingService implements GreetingService{
    @Override
    public String greet() {
        return "holla amigos";
    }
}
