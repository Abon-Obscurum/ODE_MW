package ode01.hirachie;

public abstract class Mensch extends Saeugetier{
    public Mensch(String name) {
        super(name);
    }

    public void sprechen(){
        System.out.println( "\"" + getName() + "\":" + "Nonsens"  );
    }
}
