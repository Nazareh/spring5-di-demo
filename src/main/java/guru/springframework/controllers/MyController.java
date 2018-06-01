package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private GreetingService greetingService;

    public String sayHello(){
        System.out.println("Hello!!!");

        return greetingService.sayGreeting();

    }
}
