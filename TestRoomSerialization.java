import java.io.*;

/**
 * Клас для тестування коректності результатів обчислень та серіалізації/десеріалізації.
 */
public class TestRoomSerialization {

    /**
     * Тестирує коректність результатів обчислень та серіалізації/десеріалізації об'єкта Room.
     * @param args аргументи командного рядка
     * @throws IOException при помилці вводу/виводу
     * @throws ClassNotFoundException якщо клас не було знайдено під час десеріалізації
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Створюємо новий об'єкт класу Room
        Room room = new Room(5, 4, 3);

        // Збереження стану об'єкта
        room.saveState();

        // Відновлення стану об'єкта
        Room restoredRoom = Room.restoreState();

        // Порівнюємо результати обчислень двох об'єктів
        if (restoredRoom != null) {
            boolean isCorrect = compareRooms(room, restoredRoom);
            if (isCorrect) {
                System.out.println("Тест серіалізації та десеріалізації пройдений успішно!");
            } else {
                System.out.println("Тест серіалізації та десеріалізації не пройдений: результати не співпадають!");
            }
        } else {
            System.out.println("Не вдалося відновити стан кімнати.");
        }
    }

    /**
     * Порівнює результати обчислень двох об'єктів класу Room.
     * @param room1 перший об'єкт класу Room
     * @param room2 другий об'єкт класу Room
     * @return true, якщо результати обчислень співпадають; false - у протилежному випадку
     */
    private static boolean compareRooms(Room room1, Room room2) {
        return room1.calculatePerimeter() == room2.calculatePerimeter() &&
                room1.calculateArea() == room2.calculateArea() &&
                room1.calculateVolume() == room2.calculateVolume();
    }
}
