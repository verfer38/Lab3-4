package exceptions;

public class CharacterNotFoundException extends Exception {
	public CharacterNotFoundException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Поиск персонажа не удался: " + super.getMessage();
	}
}