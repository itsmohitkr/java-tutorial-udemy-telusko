package online.devplanet.config;

import online.devplanet.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//  @Bean(name = "comp2") // use this if you want to give some name to bean.
    @Bean // the default bean name is the name of the method name.
    public Desktop desktop(){
        return new Desktop();
    }

}
