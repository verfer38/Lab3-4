import model.*;
import enums.CharacterState;
import exceptions.AppearanceChangeException;
import exceptions.CharacterNotFoundException;
import exceptions.InvalidStateException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) {
		System.setProperty("console.encoding", "UTF-8");
		System.setProperty("file.encoding", "UTF-8");

		Location palace = new Location("Дворец", "Королевский дворец", Location.LocationType.PALACE, 50, 50);
		Location forest = new Location("Лес", "Темный лес", Location.LocationType.FOREST, 34, 54);

		Person eliza = new Person("Элиза", palace, true, "женский", 175, 56);
		Person evilQueen = new Person("Злая королева", palace, true, "женский", 165, 67);
		Person father = new Person("Король", palace, true, "мужской", 211, 87);
		Dog dog = new Dog("Дворцовая собака", palace, true);
		Swallow swallow = new Swallow("Маленькая ласточка", palace, true);

		List<Person> brothers = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < 3; i++) {
			Person brother = new Person("Брат " + (i+1), forest, true, "мужской", 175, 67);
			brothers.add(brother);
		}

		System.out.println("История начинается во " + palace);

		father.interact(eliza);
		dog.interact(eliza);
		swallow.interact(eliza);
		
		System.out.println("Элиза теперь " + eliza.toString());

		System.out.println("Элиза отправляется в " + forest);
		try {
			if (rand.nextDouble() > 0.3) {
				throw new CharacterNotFoundException("Братьев нигде нет.");
			}
			System.out.println("Элиза продолжает поиски своих братьев...");
			for (Person brother : brothers) {
				System.out.println("Найден " + brother.getName() + " в лесу!");
			}
		} catch (CharacterNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
