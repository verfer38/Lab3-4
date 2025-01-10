package model;

public class AppearanceChangeFailedException extends Exception {
	public AppearanceChangeFailedException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Ошибка изменения внешности: " + super.getMessage();
	}
}