package online.devplanet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        // ApplicationContext is created, and spring.xml is loaded from the classpath
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Fetch the 'alien1' bean from the Spring container
        // This will return the same instance by default (Singleton scope)
        Alien obj1 = (Alien) context.getBean("alien1");

        // Set obj1's age to 24
        obj1.age = 24;
        System.out.println(obj1.age);

        // Fetch the 'alien1' bean again
        // Since it's a Singleton bean by default, obj2 will reference the same instance as obj1
        Alien obj2 = (Alien) context.getBean("alien1");
        System.out.println(obj2.age);

        // Explanation:
        // By default, Spring beans are Singleton-scoped. This means that obj1 and obj2
        // are pointing to the same Alien object (same instance) managed by Spring.
        // As a result, any changes made to obj1 are also reflected in obj2.

        // To create a new instance (different objects for obj1 and obj2),
        // we can change the bean scope to 'prototype' in the spring.xml configuration.
    }
}