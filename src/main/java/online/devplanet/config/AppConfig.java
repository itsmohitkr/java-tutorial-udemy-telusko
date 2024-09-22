package online.devplanet.config;

import online.devplanet.Alien;
import online.devplanet.Computer;
import online.devplanet.Desktop;
import online.devplanet.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    //  now we have 2 beans:
    // 1st way: use @Qualifier("laptop") here :     public Alien alien(@Qualifier("laptop") Computer comp){
    // 2nd way: use @Primary
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

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }

}
