package com.rahul.spring5.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DefaultService implements GreetingService{
    @Override
    public String greet() {
        return "default greeting :: Namaste";
    }
}
