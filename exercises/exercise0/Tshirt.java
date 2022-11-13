package exercises.exercise0;

/*
 * Class Tshirt
 */
public class Tshirt {
    private String brand;
    private int size;
    private String length;
    private String weight;
    private String sleeves;
    private String color;
    private String comfort;
    private int price;

    /*
     * Constructor
     */
    public Tshirt(String brand, int size, String length, String weight, String sleeves, String color, String comfort, int price){
        this.brand = brand; 
        this.size = size; 
        this.length = length;
        this.weight = weight;
        this.sleeves = sleeves; 
        this.color = color; 
        this.comfort = comfort;   
        this.price = price; 

        System.out.println("length of this top is: " + length);
    }

    /*
     * Method to print Color
     */    public void PrintColor() {
        System.out.println("My color is: " + this.color);
    }

    /*
     * Method to print Comfort
     */
    public void PrintComfort() {
        System.out.println("My comfort is: " + this.comfort);
    }

    /*
     * Method to print Price
     */
    public void PrintPrice() {
        System.out.println("My price is: " + this.price);
    }
}
