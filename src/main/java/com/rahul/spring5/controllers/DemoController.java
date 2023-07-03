package com.rahul.spring5.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    public String sayHello() {
        System.out.println("hello I am result of component scan");
        return "hi from demo controller";
    }
}
