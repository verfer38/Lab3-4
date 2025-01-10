package model.characters;

import model.*;
import enums.CharacterState;

public class EvilQueen extends Person {
    public EvilQueen(String name, Location location, boolean isRoyal) {
        super(name, location, isRoyal);
    }

    public void plotEvil() {
        System.out.println(name + " замышляя коварные планы в " + location.getName());
    }
}

