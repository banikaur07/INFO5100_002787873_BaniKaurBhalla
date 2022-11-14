package exercises.exercise0;

/*
 * Class Mobile
 */
public class Mobile {
    private String size;
    private String brand;
    private String color;
    private int price;
    private String screensize;
    private String height;
    private String memory;
    private String storage;

    /*
     * Constructor
     */
    public Mobile(String size, String brand, String color, int price, String screensize, String height, String memory, String storage){
        this.size = size; 
        this.brand = brand; 
        this.color = color;
        this.price = price;
        this.screensize = screensize; 
        this.height = height; 
        this.memory = memory;
        this.storage = storage; 

        System.out.println("price of this laptop is: " + price);
    }

    /*
     * Method to print Height
     */    public void printHeight() {
        System.out.println("My height is: " + this.height);
    }

    /*
     * Method to print Memory
     */
    public void printMemory() {
        System.out.println("My memory is: " + this.memory);
    }

    /*
     * Method to print Size
     */
    public void printSize() {
        System.out.println("My size is: " + this.size);
    }
    
}
