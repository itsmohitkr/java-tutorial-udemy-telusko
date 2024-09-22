package online.devplanet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age;

//    @Autowired
//    @Qualifier("comp2")
    private Computer comp;

    public Alien() {
        System.out.println("Alien object created");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Computer getComp() {
        return comp;
    }
    @Autowired
    @Qualifier("laptop") // this will have higher priority than @primary in Desktop
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("coding ...");
        comp.compile();
    }
}
