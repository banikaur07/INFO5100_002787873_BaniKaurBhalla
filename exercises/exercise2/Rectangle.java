package exercises.exercise2;

public class Rectangle extends Shape {
    public static String className = "Rectangle";
    public static String color = "blue";

    public int length;
    public int width;

    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        int area = length * width ;
        System.out.println ("Area of the Rectangle is: " + area);
         
    }
    @Override
    void calculatePerimeter() {
        int perimeter = 2 * (length + width);
        System.out.println ("Perimeter of the Rectangle is: " + perimeter);
    }
}
