package com.rahul.spring5;

import com.rahul.spring5.controllers.DefaultController;
import com.rahul.spring5.controllers.DemoController;
import com.rahul.spring5.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5Application {

    public static void main(String[] args) {
       ApplicationContext ctx= SpringApplication.run(Spring5Application.class, args);
        DemoController ctrl=(DemoController) ctx.getBean("demoController");
        System.out.println(ctrl.sayHello());
        GreetingController greetingController=(GreetingController)ctx.getBean("greetingController");
        greetingController.greet();
        DefaultController defaultController= (DefaultController)ctx.getBean("defaultController");
        defaultController.greetDefault();
    }

}
