package online.devplanet.config;

import online.devplanet.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean // use bean if you want spring to create object of desktop.
    public Desktop desktop(){
        return new Desktop();
    }

}
