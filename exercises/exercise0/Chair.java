package exercises.exercise0;

/*
 * Class Chair
 */
public class Chair {
    private String brand;
    private int size;
    private String area;
    private String height;
    private String width;
    private String color;
    private float circumference;
    private int price;

    /*
     * Constructor
     */
    public Chair(String brand, int size, String area, String height, String width, String color, float circumference, int price){
        this.brand = brand; 
        this.size = size; 
        this.area = area;
        this.height = height;
        this.width = width; 
        this.color = color; 
        this.circumference = circumference;
        this.price = price; 

        System.out.println("area of this chair is: " + area);
    }

    /*
     * Method to print Height
     */    public void PrintHeight() {
        System.out.println("My height is: " + this.height);
    }

    /*
     * Method to print Width
     */
    public void PrintWidth() {
        System.out.println("My width is: " + this.width);
    }

    /*
     * Method to print Price
     */
    public void PrintPrice() {
        System.out.println("My price is: " + this.price);
    }
    
}
