package com.rahul.spring5.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i8nService")

public class EnglishGreetingsService implements GreetingService{
    @Override
    public String greet() {
        return "hello everyone";
    }
}
