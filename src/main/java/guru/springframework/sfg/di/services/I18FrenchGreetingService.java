package guru.springframework.sfg.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"FR","default"})
@Service("i18Service")
public class I18FrenchGreetingService implements GreetingService{

    public String sayGreeting() {
        return "Bonjour le monde";
    }
}
