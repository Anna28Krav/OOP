// Реалізація фабрики для CalculationData
public class CalculationDataFactoryImpl implements CalculationDataFactory {
    @Override
    public CalculationData createCalculationData(double length, double width, double height) {
        return new CalculationData(length, width, height);
    }
}