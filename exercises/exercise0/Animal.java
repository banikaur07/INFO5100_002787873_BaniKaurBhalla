package exercises.exercise0;

/*
 * Class Animal
 */
public class Animal {

    /*
     * Nested Class to display all attributes
     */
    class NestedDisplay {
        /*
         * Method to print all attributes
         */
        public void printAll() {
            printType();
            printName();
            printColor();
        }
    }

    /*
     * Nested Class to display food
     */
    class NestedFood {
        /*
         * Method to get food
         */
        public String getFood() {
            return getFoodDetails();
        }
    }

    private String type;
    private String name;
    private String color;
    private String size;
    private String food;
    private boolean canFly;
    private boolean canRun;
    private int weight;

    /*
     * Constructor
     */
    public Animal(String type, String name, String color, String size, String food, boolean canFly, boolean canRun, int weight){
        this.type = type; 
        this.name = name;
        this.color = color;
        this.size = size;
        this.canFly = canFly;
        this.canRun = canRun;
        this.weight = weight;

        System.out.println("name of this animal is: " + name);
    }

    /*
     * Method to print Name
     */
    public void printName() {
        System.out.println("My name is: " + this.name);
    }

    /*
     * Method to print Type
     */
    public void printType() {
        System.out.println("My type is: " + this.type);
    }

    /*
     * Method to print Color
     */
    public void printColor() {
        System.out.println("My color is: " + this.color);
    }

    /*
     * Method to get food
     */
    public String getFoodDetails() {
        return this.food;
    }

}