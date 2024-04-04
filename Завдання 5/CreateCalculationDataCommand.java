// Команда для створення CalculationData
public class CreateCalculationDataCommand implements Command {
    private CalculationDataFactory factory;
    private double length;
    private double width;
    private double height;
    private CalculationData data;

    public CreateCalculationDataCommand(CalculationDataFactory factory, double length, double width, double height) {
        this.factory = factory;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void execute() {
        data = factory.createCalculationData(length, width, height);
    }

    @Override
    public void undo() {
        // Відміна створення об'єкта
        data = null;
    }

    public CalculationData getData() {
        return data;
    }
}
