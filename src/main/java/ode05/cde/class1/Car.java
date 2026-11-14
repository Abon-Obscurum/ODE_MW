package ode05.cde.class1;

public class Car implements Drivable {
    private String name;
    private int hp;



    public Car(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public void drive(int distance, String noise) {
        System.out.println("Driving " + distance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
