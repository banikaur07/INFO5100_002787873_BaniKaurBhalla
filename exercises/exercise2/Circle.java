package exercises.exercise2;

import java.lang.Math;

public class Circle extends Shape {
    public static String className = "Circle";
    public static String color = "red";

    public int radius;
    public float pi;

    public Circle (int radius, float pi){
        this.radius = radius;
        this.pi = pi;
    }

    @Override
    void calculateArea() {
        double area = pi * Math.pow(radius, 2) ;
        System.out.println ("Area of the Circle:" + area);  
    }

    @Override
    void calculatePerimeter() {
        float perimeter = 2 * pi * radius ;
        System.out.println("Perimeter of the Circle:" + perimeter);
    }
}
