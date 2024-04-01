public class JMain {
    public static void main(String[] args) {
        Room room = new Room(10, 5, 3); // Створюємо новий об'єкт класу Room

        // Збереження стану об'єкта
        room.saveState();

        // Відновлення стану об'єкта
        Room restoredRoom = Room.restoreState();
        if (restoredRoom != null) {
            restoredRoom.displayInfo(); // Виведення інформації про кімнату
        } else {
            System.out.println("Failed to restore room staste.");
        }
    }
}