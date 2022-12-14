package exercises.exercise5.Singleton;

/*
 * Singleton Class
 */
public class Printer {
    private static Printer printerObj;
    private int pageCount;

    /**
     * Private Constructor
     */
    private Printer() {
    }
    
    /**
     * Method to get the single instance of this class
     * @return
     */
    public static Printer getInstance() {
        if (printerObj == null) {
            printerObj = new Printer();
        }
        return printerObj;
    }

    /**
     * Method to print page
     * @param text
     */
    public void printPage(String text){
        System.out.println(text + "Pages printed today " + pageCount++);
    }
}