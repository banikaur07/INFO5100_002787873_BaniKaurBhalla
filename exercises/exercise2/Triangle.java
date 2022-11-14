package exercises.exercise2;

public class Triangle extends Shape {
    public static String className = "Triangle";
    public static String color = "purple";

    public int height;
    public int base;
    public int side1;
    public int side2;

    public Triangle (int height, int base, int side1, int side2){
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;

    }

    @Override
    void calculateArea() {
        double area = (base * height)/2;
        System.out.println("Area of the Triangle: " + area);
        
    }

    @Override
    void calculatePerimeter() {
        int perimeter = side1 + base + side2;
        System.out.println("Perimeter of the Triangle: " + perimeter);
    }
}

