package online.devplanet;

import online.devplanet.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj =  context.getBean(Alien.class);
//        obj.setAge(22); // don't set age from here.
        System.out.println(obj.getAge());
        obj.code();



    }
}