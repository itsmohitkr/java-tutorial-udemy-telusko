package online.devplanet;

public class Desktop implements Computer{
    public Desktop() {
        System.out.println("desktop object created");
    }

    @Override
    public void compile(){
        System.out.println("compiling on desktop");
    }
}
