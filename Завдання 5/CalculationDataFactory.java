// Фабрика для CalculationData
public class CalculationDataFactory {
    private static CalculationDataFactory instance;

    private CalculationDataFactory() {}

    public static CalculationDataFactory getInstance() {
        if (instance == null) {
            instance = new CalculationDataFactory();
        }
        return instance;
    }

    public CalculationData createCalculationData(double length, double width, double height) {
        return new CalculationData(length, width, height);
    }
}
