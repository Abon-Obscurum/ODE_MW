package ode05.networking.pokedex;

public class Pokemon {
    String name;
    String level;

    @Override
    public String toString() {
        return "name=" + name +
                ", level=" + level;
    }
}
