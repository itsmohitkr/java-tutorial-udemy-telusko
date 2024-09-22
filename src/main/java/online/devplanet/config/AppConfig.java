package online.devplanet.config;

import online.devplanet.Alien;
import online.devplanet.Computer;
import online.devplanet.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(Computer comp){
        Alien obj =new Alien();
        obj.setAge(24);
//      obj.setComp(desktop());
        obj.setComp(comp);
        return obj;
    }

    @Bean
    public Desktop desktop(){
        return new Desktop();
    }

}
