

// Інтерфейс для "фабрикованих" об'єктів, що представляє набір методів для відображення результатів обчислень
interface CalculationResultDisplay {
    String displayPerimeter(double perimeter);
    String displayArea(double area);
    String displayVolume(double volume);
}

// Інтерфейс для "фабрикуючого" методу
interface CalculationDataFactory {
    CalculationData createCalculationData(double length, double width, double height);
}