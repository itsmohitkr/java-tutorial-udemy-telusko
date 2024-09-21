package online.devplanet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 =  context.getBean("alien1", Alien.class);

        obj1.code();

        // Retrieve a bean of type Computer from the Spring container
        // (by its class type)

//       Potential Issue: Multiple Beans of the Same Type:
//		If Computer is an interface and both Laptop and Desktop implement Computer, calling context.getBean(Computer.class) will lead to ambiguity.
//		You can resolve this by - Specify a primary bean: Mark one of the beans as primary using the @Primary annotation or the primary attribute in XML.

        Computer comp = context.getBean(Computer.class);
        Desktop obj2 = context.getBean(Desktop.class);
    }
}