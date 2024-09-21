package online.devplanet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) context.getBean("alien1");

//        obj1.setAge(25);
        System.out.println(obj1.getAge());

        /*  issue : we are assigning the value to the private variable using
            setter method, but what if we want the spring to inject the value, how to achieve?

            solution: Setter Injection: Use the <property> tag in spring.xml to inject values via setter methods.
            <bean id="alien1" class="online.devplanet.Alien">
                <!-- Inject the value of 'age' property -->
                <property name="age" value="22"/>
            </bean>
        */
    }
}