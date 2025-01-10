package model;

public class AppearanceChangeException extends Exception {
	public AppearanceChangeException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Ошибка изменения внешности: " + super.getMessage();
	}
}