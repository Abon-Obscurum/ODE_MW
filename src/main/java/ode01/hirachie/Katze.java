package ode01.hirachie;

public abstract class Katze extends Saeugetier {

    public Katze(String name) {
        super(name);
    }

    public void schnurren(){
        System.out.println( "\"" + getName() + "\":" + " Purr");
    }
}
