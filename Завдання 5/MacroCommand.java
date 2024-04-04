import java.util.Stack;

// Макрокоманда для виконання групи команд
public class MacroCommand implements Command {
    private Stack<Command> commands = new Stack<>();

    // Метод для виконання всіх команд в макрокоманді
    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    // Метод для скасування всіх команд в макрокоманді
    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }

    // Метод для додавання команди до макрокоманди
    public void addCommand(Command command) {
        commands.push(command);
    }
}
