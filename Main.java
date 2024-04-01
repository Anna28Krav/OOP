public class Main {
    public static void main(String[] args) {
        // Создаем объект CalculationData с заданными параметрами
        CalculationData data = new CalculationData(10.0, 5.0, 3.0);

        // Создаем объект CalculationSolver и передаем в него CalculationData
        CalculationSolver solver = new CalculationSolver(data);

        // Выполняем вычисления и получаем результаты
        CalculationData result = solver.solve();

        // Выводим результаты
        System.out.println("Perimeter: " + result.getPerimeter());
        System.out.println("Area: " + result.getArea());
        System.out.println("Volume: " + result.getVolume());
    }
}

