package online.devplanet;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

 @Component()
 @Primary // means: this Alien is a class and spring has to manage object for it.
 @Scope("prototype")
 public class Desktop implements Computer{
    public Desktop() {
        System.out.println("desktop object created");
    }

    @Override
    public void compile(){

        System.out.println("compiling on desktop");
    }
}
