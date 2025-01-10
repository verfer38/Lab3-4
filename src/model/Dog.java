package model;

import enums.CharacterState;

public class Dog extends Character implements Animal {
	public Dog(String name, Location location, boolean isRoyal) {
		super(name, location, isRoyal);
	}

	@Override
	public boolean recognizeCharacter(Character other) {
		System.out.println(this.getName() + " узнает " + other.getName() + " несмотря на маскировку");
		other.getRecognizedBy().add(this);
		return true;
	}

	@Override
	public void makeSound() {
		System.out.println(this.getName() + " лает!");
	}

	@Override
	public void interact(Character other) {
		if (other.getState() == enums.CharacterState.DISGUISED) {
			recognizeCharacter(other);
		} else {
			System.out.println(this.getName() + " приветствует " + other.getName());
		}
	}
}
