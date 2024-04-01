// Класс для решения задачи по заданным параметрам
class CalculationSolver {
    private CalculationData data;

    // Конструктор класса, принимающий объект CalculationData
    public CalculationSolver(CalculationData data) {
        this.data = data;
    }

    // Метод для выполнения вычислений и возвращения результатов
    public CalculationData solve() {
        data.calculatePerimeter();
        data.calculateArea();
        data.calculateVolume();
        return data;
    }
}
