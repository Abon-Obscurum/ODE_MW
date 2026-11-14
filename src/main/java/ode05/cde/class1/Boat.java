package ode05.cde.class1;

public class Boat implements Drivable {

    @Override
    public void drive(int distance, String noise) {
        System.out.println("class1.Boat drives " + distance);
    }
}
