package com.rahul.spring5.controllers;

import com.rahul.spring5.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {
    GreetingService greetingService;

    public ProfileController(@Qualifier("i8nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
