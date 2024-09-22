package online.devplanet;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

 @Component()
 @Primary// means: this Alien is a class and spring has to manage object for it.
public class Desktop implements Computer{
    public Desktop() {
        System.out.println("desktop object created");
    }

    @Override
    public void compile(){

        System.out.println("compiling on desktop");
    }
}
