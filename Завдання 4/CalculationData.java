import java.io.Serializable;

// Клас, що представляє дані для обчислень
public class CalculationData implements Serializable {
    private static final long serialVersionUID = 1L;
    private double length;
    private double width;
    private double height;

    // Конструктор класу
    public CalculationData(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Методи для обчислення периметру, площі та об'єму
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    // Геттери для отримання параметрів
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Виведення результатів у текстовому вигляді
    public String displayResults(CalculationResultDisplay display) {
        return display.displayResults(this);
    }
}