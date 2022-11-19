package exercises.exercise3b;

import java.io.Serializable;

/*
 * Class Rectangle
 */
public class Rectangle extends Shape implements Serializable {
    public static String className = "Rectangle";
    public static String color = "blue";

    public int length;
    public int width;

    /*
     * Constructor
     */
    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        int area = length * width ;
        System.out.println ("Area of the Rectangle is: " + area);
         
    }
    @Override
    public void calculatePerimeter() {
        int perimeter = 2 * (length + width);
        System.out.println ("Perimeter of the Rectangle is: " + perimeter);
    }
}
