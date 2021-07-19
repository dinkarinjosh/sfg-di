package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    private GreetingService greetingService;

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }
}
