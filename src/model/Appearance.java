package model;

public record Appearance(
	String skinColor,
	String hairState,
	boolean isDisguised
) {
	@Override
	public String toString() {
		return "Внешний вид [цвет кожи=" + skinColor + ", состояние волос=" + hairState + ", узнаваем=" + isDisguised + "]";
	}
}