package exercises.exercise0;

/*
 * Class Bottle
 */
public class Bottle {
    private String brand;
    private String size;
    private String color;
    private String length;
    private String width;
    private int price;
    private String circumference;
    private String capacity;

    /*
     * Constructor
     */
    public Bottle(String brand, String size, String color, String length, String width, int price, String circumference, String capacity){
        this.brand = brand;      
        this.size = size;
        this.color =  color;
        this.length = length; 
        this.width = width; 
        this.price = price;
        this.circumference = circumference; 
        this.capacity = capacity; 


        System.out.println("brand of this bottle is: " + brand);
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
