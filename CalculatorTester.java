/**
 * Клас для тестування коректності результатів обчислень та серіалізації/десеріалізації
 */
public class CalculatorTester {
    
    /**
     * Метод для тестування обчислення периметру приміщення
     * @param length довжина приміщення
     * @param width ширина приміщення
     * @return периметр приміщення
     */
    public double testPerimeter(double length, double width) {
        // Реалізація обчислення периметру
        return 2 * (length + width);
    }
    
    /**
     * Метод для тестування обчислення площі приміщення
     * @param length довжина приміщення
     * @param width ширина приміщення
     * @return площа приміщення
     */
    public double testArea(double length, double width) {
        // Реалізація обчислення площі
        return length * width;
    }
    
    /**
     * Метод для тестування обчислення об'єму приміщення
     * @param length довжина приміщення
     * @param width ширина приміщення
     * @param height висота приміщення
     * @return об'єм приміщення
     */
    public double testVolume(double length, double width, double height) {
        // Реалізація обчислення об'єму
        return length * width * height;
    }
    
    /**
     * Метод для тестування серіалізації/десеріалізації даних
     * @param data дані для серіалізації/десеріалізації
     * @return серіалізовані/десеріалізовані дані
     */
    public String testSerialization(String data) {
        // Реалізація серіалізації/десеріалізації
        return data.toUpperCase(); // Наприклад, перетворення у верхній регістр
    }
}
