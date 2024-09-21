package online.devplanet;

import online.devplanet.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt1 =  context.getBean(Desktop.class);
        dt1.compile();

        Desktop dt2 =  context.getBean(Desktop.class);
        dt2.compile();

    }
}