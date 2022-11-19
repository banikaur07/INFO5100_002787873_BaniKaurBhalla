package exercises.exercise3b;

import java.io.Serializable;

/*
 * Class Triangle
 */
public class Triangle extends Shape implements Serializable{
    public static String className = "Triangle";
    public static String color = "purple";

    public int height;
    public int base;
    public int side1;
    public int side2;

    /*
     * Constructor
     */
    public Triangle (int height, int base, int side1, int side2){
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;

    }

    @Override
    public void calculateArea() {
        double area = (base * height)/2;
        System.out.println("Area of the Triangle: " + area);
        
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = side1 + base + side2;
        System.out.println("Perimeter of the Triangle: " + perimeter);
    }
}

