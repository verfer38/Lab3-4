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

		Location palace = new Location("Дворец", "Королевский дворец", Location.LocationType.PALACE);
		Location forest = new Location("Лес", "Темный лес", Location.LocationType.FOREST);

		Person eliza = new Person("Элиза", palace, true);
		Person evilQueen = new Person("Злая королева", palace, true);
		Person father = new Person("Король", palace, true);
		Dog dog = new Dog("Дворцовая собака", palace, true);
		Swallow swallow = new Swallow("Маленькая ласточка", palace, true);

		List<Person> brothers = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < 3; i++) {
			Person brother = new Person("Брат " + (i+1), forest, true);
			brothers.add(brother);
		}

		System.out.println("История начинается во дворце...");
		
		try {
			if (rand.nextDouble() < 0.8) { // 80% success rate
				try {
					eliza.changeAppearance("сок грецкого ореха", "замаскирована");
					System.out.println("Злая королева изменила внешний вид Элизы!");
				} catch (InvalidStateException e) {
					System.out.println("Ошибка при изменении внешности: " + e.getMessage());
				}
			} else {
				throw new exceptions.AppearanceChangeException("Попытка маскировки не удалась!");
			}
		} catch (exceptions.AppearanceChangeException e) {
			System.out.println("Не удалось изменить внешность: " + e.getMessage());
		}

		father.interact(eliza);
		dog.interact(eliza);
		swallow.interact(eliza);
		
		System.out.println("Элиза теперь " + eliza.toString());

		try {
			if (rand.nextDouble() > 0.3) { // 70% chance to find brothers
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
