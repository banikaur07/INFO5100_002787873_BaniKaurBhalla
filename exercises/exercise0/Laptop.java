package exercises.exercise0;

/*
 * Class Laptop
 */
public class Laptop {
    private String brand;
    private int price;
    private String color;
    private String size;
    private String processor;
    private int storage;
    private int ram;
    private String screensize;

    /*
     * Constructor
     */
    public Laptop(String brand, int price, String color, String size, String processor, int storage, int ram, String screensize){
        this.brand = brand; 
        this.price = price; 
        this.color = color;
        this.size =  size;
        this.processor = processor; 
        this.storage = storage; 
        this.ram = ram;
        this.screensize = screensize; 


        System.out.println("brand of this laptop is: " + brand);
    }

    /*
     * Method to print Brand
     */
    public void printBrand() {
        System.out.println("My brand is: " + this.brand);
    }

    /*
     * Method to print Color
     */
    public void printColor() {
        System.out.println("My color is: " + this.color);
    }

    /*
     * Method to print Size
     */
    public void printSize() {
        System.out.println("My size is: " + this.size);
    }
}
