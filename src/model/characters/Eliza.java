package model.characters;

import model.*;
import enums.CharacterState;

public class Eliza extends Person {
	public Eliza(String name, Location location, boolean isRoyal) {
		super(name, location, isRoyal);
	}

	public void wander() {
		System.out.println(name + " блуждание по " + location.getName());
	}

	public void stay() {
		System.out.println(name + " стоит на " + location.getName());
	}
}
