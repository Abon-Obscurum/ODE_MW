package ode05.cde.class2;

public class Tiger extends Cat {

    @Override
    public void makeNoise() {
        //super.makeNoise();
        System.out.println("GRRR");
    }

    public void eatCat(Cat cat, int times) {
        times = 10;
        cat.setName("Not so alive cat");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Sammy");

        int times = 5;
        Tiger tiger = new Tiger();
        tiger.eatCat(cat, times);
        System.out.println("Cat is named " + cat.getName());
        System.out.println("Times is " + times);

        cat.makeNoise(); // Purr
        tiger.makeNoise(); // GRR

        Cat tigerAsCat = new Tiger();
        tigerAsCat.makeNoise(); // GRR
        tigerAsCat.makeNoise("Name");

        Cat[] catZoo = new Cat[3];

    }
}
