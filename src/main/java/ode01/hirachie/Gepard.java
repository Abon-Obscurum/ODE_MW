package ode01.hirachie;

public class Gepard extends Katze{
    private int topSpeed = 90;
    public Gepard(String name, int topSpeed) {
        super(name);
        if(topSpeed > 0){
            this.topSpeed = topSpeed;
        }
    }
    public Gepard(int topSpeed){
        super("DSGVO-Konform Anonymisierter Gepard");
        this.topSpeed = topSpeed;
    }

    public void superSpeed(){
        System.out.println(getName()  + " beschleunigt auf " + topSpeed + "km/h");
    }

}
