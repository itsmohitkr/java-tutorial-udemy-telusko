package online.devplanet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext();
        Alien obj1= (Alien) context.getBean("alien");

        obj1.code();


    }
}