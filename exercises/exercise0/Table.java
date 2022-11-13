package exercises.exercise0;

/*
 * Class Table
 */
public class Table {
    private String brand;
    private int length;
    private int price;
    private int height;
    private int area;
    private String weight;
    private String color;
    private String width;

    /*
     * Constructor
     */
    public Table(String brand, int length, int price, int height, int area, String weight, String color, String width){
        this.brand = brand; 
        this.length = length; 
        this.price = price;
        this.height = height;
        this.area = area; 
        this.weight = weight; 
        this.color = color;
        this.width = width; 

        System.out.println("brand of this laptop is: " + brand);
    }

    /*
     * Method to print Brand
     */
    public void PrintBrand() {
        System.out.println("My brand is: " + this.brand);
    }
 
    /*
     * Method to print Area
     */
    public void PrintArea() {
        System.out.println("My area is: " + this.area);
    }

    /*
     * Method to print Color
     */
    public void PrintColor() {
        System.out.println("My color is: " + this.color);
    }
    
}
