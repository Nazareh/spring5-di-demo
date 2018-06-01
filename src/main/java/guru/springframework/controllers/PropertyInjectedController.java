package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

}

