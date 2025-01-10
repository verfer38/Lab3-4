package exceptions;

public class InvalidStateException extends RuntimeException {
	public InvalidStateException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Недопустимый переход состояния: " + super.getMessage();
	}
}