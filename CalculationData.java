import java.io.Serializable;

// Класс, который будет сериализован для хранения параметров и результатов вычислений
class CalculationData implements Serializable {
    private static final long serialVersionUID = 1L;
    private double length;
    private double width;
    private double height;
    private double perimeter;
    private double area;
    private double volume;

    // Конструктор класса
    public CalculationData(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Методы для вычисления периметра, площади и объема
    public void calculatePerimeter() {
        this.perimeter = 2 * (length + width);
    }

    public void calculateArea() {
        this.area = length * width;
    }

    public void calculateVolume() {
        this.volume = length * width * height;
    }

    // Геттеры для получения результатов вычислений
    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }
}

