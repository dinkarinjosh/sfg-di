package guru.springframework.sfg.di.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class MyController {

    public String sayHello(){
        System.out.println("Hello World");
        return "Hi Folks";
    }
}
