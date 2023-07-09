package com.rahul.spring5.controllers;

import com.rahul.spring5.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class DefaultController {
    GreetingService greetingService;

    public DefaultController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void greetDefault(){
        System.out.println( greetingService.greet());
    }
}
