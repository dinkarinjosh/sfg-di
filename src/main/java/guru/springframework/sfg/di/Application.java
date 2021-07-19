package guru.springframework.sfg.di;

import guru.springframework.sfg.di.controllers.I18Controller;
import guru.springframework.sfg.di.controllers.MyController;
import guru.springframework.sfg.di.controllers.ConstructorInjectedController;
import guru.springframework.sfg.di.controllers.PropertyInjectedController;
import guru.springframework.sfg.di.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");
        System.out.println(myController.sayHello());
        System.out.println("------Primary Bean based  Controller-------");
        System.out.println(myController.getGreetingService());

        System.out.println("------Constructor based  Controller-------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
        System.out.println("------Property based  Controller-------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreetingService());

        System.out.println("------Profile based  Controller-------");
        I18Controller i18Controller = (I18Controller) applicationContext.getBean("i18Controller");
        System.out.println(i18Controller.getGreeting());
        ;
    }

}
