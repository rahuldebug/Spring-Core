package com.rahul.spring5.controllers;

import com.rahul.spring5.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    GreetingService greetingService;
    GreetingController(GreetingService greetingService){
        this.greetingService=greetingService;
    }
    public void greet(){
        System.out.println(greetingService.greet());
    }
}
