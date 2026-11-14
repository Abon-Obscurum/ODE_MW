package ode01.hirachie;

public abstract class Hund extends Saeugetier{
    public Hund(String name) {
        super(name);
    }
    public void bellen(){
        System.out.println( "\"" + getName() + "\":" + " Wuff");
    }
}
