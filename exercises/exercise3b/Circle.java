package exercises.exercise3b;

import java.io.Serializable;
import java.lang.Math;

/*
 * class Circle
 */
public class Circle extends Shape implements Serializable {
    public static String className = "Circle";
    public static String color = "red";

    public int radius;
    public float pi;

    /*
     * Constructor
     */
    public Circle (int radius, float pi){
        this.radius = radius;
        this.pi = pi;
    }

    @Override
    public void calculateArea() {
        double area = pi * Math.pow(radius, 2) ;
        System.out.println ("Area of the Circle:" + area);  
    }

    @Override
    public void calculatePerimeter() {
        float perimeter = 2 * pi * radius ;
        System.out.println("Perimeter of the Circle:" + perimeter);
    }
}
