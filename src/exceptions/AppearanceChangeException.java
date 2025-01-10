package exceptions;

public class AppearanceChangeException extends Exception {
	public AppearanceChangeException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Изменение внешнего вида не удалось: " + super.getMessage();
	}
}