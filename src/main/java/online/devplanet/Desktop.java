package online.devplanet;

import org.springframework.stereotype.Component;

 @Component() // means: this Alien is a class and spring has to manage object for it.
public class Desktop implements Computer{
    public Desktop() {
        System.out.println("desktop object created");
    }

    @Override
    public void compile(){

        System.out.println("compiling on desktop");
    }
}
