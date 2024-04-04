// Клас для тестування функціональності програми
public class TestCalculationFunctionality {
    public static void main(String[] args) {
        // Ініціалізуємо фабрику та команди
        CalculationDataFactory factory = CalculationDataFactory.getInstance();
        CreateCalculationDataCommand createCommand = new CreateCalculationDataCommand(factory, 10.0, 5.0, 3.0);
        MacroCommand macroCommand = new MacroCommand();
        macroCommand.addCommand(createCommand);

        // Викликаємо методи для тестування
        macroCommand.execute(); // Виконуємо створення CalculationData
        CalculationData data = createCommand.getData(); // Отримуємо створені дані

        // Відображення результатів у вигляді текстової таблиці з заданими параметрами
        String tableFormat = "%-15s%-10.2f"; // Формат таблиці
        TextTableCalculationResultDisplay display = new TextTableCalculationResultDisplay(tableFormat);
        System.out.println(display.displayResults(data));

        // Скасування операцій
        macroCommand.undo();
        System.out.println("Operation undone.");
    }
}
