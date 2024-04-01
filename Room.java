import java.io.*;

class Room implements Serializable {
    private double length;
    private double width;
    private transient double height; // Поле height буде transient

    // Конструктор класу
    public Room(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Метод для розрахунку периметру
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Метод для розрахунку площі
    public double calculateArea() {
        return length * width;
    }

    // Метод для розрахунку об'єму
    public double calculateVolume() {
        return length * width * height;
    }

    // Метод для виведення інформації про кімнату
    public void displayInfo() {
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Volume: " + calculateVolume());
    }

    // Методи для збереження та відновлення стану об'єкта
    public void saveState() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("room.ser"))) {
            out.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Room restoreState() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("room.ser"))) {
            return (Room) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveInitialState() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveInitialState'");
    }

    public void restoreInitialState() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restoreInitialState'");
    }

    public void setHeight(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHeight'");
    }
}