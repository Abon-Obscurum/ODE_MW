package ode05.cde.class1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome to ODE!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        Car bmw = new Car("BMW", 100);

        Car audi = bmw;
        audi.setName("Audi");

        Drivable vehicle = new Car("Volvo", 160);
        vehicle = new Boat();

        vehicle.drive(12, "hzz");
        if (vehicle instanceof Car c) {
           // class1.Car c = (class1.Car) vehicle;
            c.getName();
        }

        //((class1.Car)vehicle).getName();

    }
}