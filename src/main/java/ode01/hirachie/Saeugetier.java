package ode01.hirachie;

public abstract class Saeugetier {
    private String name = "";

    public Saeugetier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void atmen(){
        System.out.println(name + " Atmet !!!");
    }

}
