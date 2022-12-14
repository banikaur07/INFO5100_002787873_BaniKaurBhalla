package exercises.exercise5.Singleton;

public class SingletonExample {
    public static void main(String[] args) {
        // Showing Singleton Design Pattern
        Printer printerObj1 = Printer.getInstance();
        Printer printerObj2 = Printer.getInstance();
        System.out.println(printerObj1 == printerObj2); // true
    }
    
}
