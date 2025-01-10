package model;

public class Swallow extends Character implements Animal {
	public Swallow(String name, Location location, boolean isActive) {
		super(name, location, isActive);
	}

	@Override
	public void makeSound() {
		System.out.println(name + " щебечет!");
	}

	@Override
	public boolean recognizeCharacter(Character character) {
		return true; // Swallows always recognize Eliza
	}

	@Override
	public void interact(Character other) {
		if (recognizeCharacter(other)) {
			System.out.println(name + " узнает " + other.name + " несмотря на маскировку");
			makeSound();
		}
	}
}