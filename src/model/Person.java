package model;

import enums.CharacterState;
import exceptions.InvalidStateException;
import java.util.ArrayList;
import java.util.List;
import java.nio.charset.StandardCharsets;

public class Person extends Character {
	protected boolean isRoyal;
	protected String appearance;
	protected List<Character> recognizedBy;
	protected String gender;
	protected double height;
	protected double weight;

	public Person(String name, Location location, boolean isRoyal, String gender, double height, double weight) {
		super(name, location, false);
		this.isRoyal = isRoyal;
		this.appearance = "normal";
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.recognizedBy = new ArrayList<>();
	}

	public void changeAppearance(String disguiseItem, String newAppearance) {
		if (disguiseItem == null || newAppearance == null) {
			throw new InvalidStateException("Параметры маскировки не могут быть null");
		}
		if (disguiseItem.isEmpty() || newAppearance.isEmpty()) {
			throw new InvalidStateException("Параметры маскировки не могут быть пустыми");
		}
		this.appearance = newAppearance;
		setState(CharacterState.DISGUISED);
	}

	@Override
	public void interact(Character other) {
		String message;
		if (getState() == CharacterState.DISGUISED) {
			message = String.format("%s не узнаёт %s", other.getName(), getName());
		} else {
			message = String.format("%s узнаёт %s", other.getName(), getName());
			recognizedBy.add(other);
		}
		System.out.println(new String(message.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
	}

	public String getName() {
		return name;
	}

	public CharacterState getState() {
		return state;
	}

	protected void setState(CharacterState state) {
		this.state = state;
	}

	protected List<Character> getRecognizedBy() {
		return recognizedBy;
	}

	@Override
	public String toString() {
		return String.format("%s [внешность=%s, состояние=%s]", 
			getName(), 
			appearance, 
			state);
	}
}