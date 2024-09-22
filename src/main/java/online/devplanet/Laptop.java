package online.devplanet;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("laptop object created");
    }

    @Override
    public void compile(){
        System.out.println("compiling on laptop");
    }
}
