package model.characters;

import model.*;

public class EvilQueen extends Person {
    public EvilQueen(String name, Location location, boolean isRoyal, String gender, double height, double weight) {
        super(name, location, isRoyal, gender, height, weight);
    }

    public void plotEvil() {
        System.out.println(name + " замышляя коварные планы в " + location.getAlias());
    }
}

