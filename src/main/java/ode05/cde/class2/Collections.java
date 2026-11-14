package ode05.cde.class2;


import java.util.*;
import java.util.function.Consumer;

public class Collections {
    public static void main(String[] args) {

        // List, Sets
        List<Cat> catZoo = new LinkedList<>();
        catZoo.add(new Tiger());
        catZoo.add(new Tiger());
        catZoo.add(new Tiger());
        catZoo.add(new Tiger());
        catZoo.add(new Tiger());
        catZoo.add(new Tiger());
        catZoo.add(new Leopard());
        catZoo.add(new Leopard());

        catZoo.get(4);

        for(Cat c: catZoo) {
            c.makeNoise();
        }

        // benannte klasse
        catZoo.forEach(new CatConsumer());
        // anonyme Klasse
        catZoo.forEach(new Consumer<Cat>() {
            @Override
            public void accept(Cat cat) {
                cat.makeNoise();
            }
        });
        // lambda
        catZoo.forEach(( cat) -> {
            cat.makeNoise();
        });
        // method-reference
        catZoo.forEach(Cat::makeNoise);

        List<String> catNames = catZoo.stream()
                .filter((cat) -> cat.getName().startsWith("S"))
                .filter((cat) -> cat.getName().endsWith("y"))
                .map(cat -> cat.getName())
                .toList();

        Set<Cat> catSet = new HashSet<>();


        // Map
        Map<String, Cat> catMap = new HashMap<>();
        catMap.put("Sammy", new Cat());

        myMethod(Cat::makeNoise, (c) -> c.makeNoise());
    }
    public static void myMethod(Consumer<Cat> catConsumer1, Consumer<Cat> catConsumer2) {

    }

    public static class CatConsumer implements Consumer<Cat> {
        @Override
        public void accept(Cat cat) {
            cat.makeNoise();
        }
    }
}
