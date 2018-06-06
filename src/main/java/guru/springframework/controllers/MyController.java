package guru.springframework.controllers;

import guru.services.GreetingService;
import org.springframework.stereotype.Controller;


@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("Hello!!!");

        return greetingService.sayGreeting();
    }
}
