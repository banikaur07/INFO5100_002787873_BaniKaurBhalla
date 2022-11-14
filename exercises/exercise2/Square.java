package exercises.exercise2;

public class Square extends Shape {
    public static String className = "Square";
    public static String color = "pink";
    
    public int side;

    public Square (int side){
        this.side = side;
    }

    @Override
    void calculateArea() {
        int area = side * side;
        System.out.println ("Area of the Square is: " + area);
    }

    @Override
    void calculatePerimeter() {
        int perimeter = 4 * side;
        System.out.println ("Perimeter of the Square is: " + perimeter);  
    }
}


     