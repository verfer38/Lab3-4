package model;

import java.util.ArrayList;
import java.util.List;
import enums.CharacterState;

public abstract class Character {
	protected String name;
	protected Location location;
	protected CharacterState state;
	protected List<Character> recognizedBy;

	public Character(String name, Location location, boolean isRoyal) {
		this.name = name;
		this.location = location;
		this.state = CharacterState.NORMAL;
		this.recognizedBy = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public CharacterState getState() {
		return state;
	}

	protected List<Character> getRecognizedBy() {
		return recognizedBy;
	}

	public abstract void interact(Character other);
}


