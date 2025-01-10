package model;

public enum CharacterState {
	NORMAL("в обычном состоянии"),
	DISGUISED("замаскирован(а)"),
	SCARED("напуган(а)"),
	CRYING("плачет"),
	EXILED("в изгнании"),
	SAD("грустит"),
	SEARCHING("ищет");

	private final String description;

	CharacterState(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}