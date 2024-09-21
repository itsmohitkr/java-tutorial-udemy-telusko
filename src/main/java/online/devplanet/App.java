package online.devplanet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) context.getBean("alien1");

        obj1.code();
        Desktop obj2 = (Desktop) context.getBean("comp2");
    }
}