package model.characters;

import model.*;

public class Eliza extends Person {
	public Eliza(String name, Location location, boolean isRoyal, String gender, double height, double weight) {
		super(name, location, isRoyal, gender, height, weight);
	}

	public void wander() {
		System.out.println(name + " блуждание по " + location.getAlias());
	}

	public void stay() {
		System.out.println(name + " стоит на " + location.getAlias());
	}
}
