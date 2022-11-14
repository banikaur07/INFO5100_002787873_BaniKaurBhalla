package exercises.exercise2;

import java.io.Serializable;

/*
 * Class Square
 */
public class Square extends Shape implements Serializable {
    public static String className = "Square";
    public static String color = "pink";
    
    public int side;

    /*
     * Constructor
     */
    public Square (int side){
        this.side = side;
    }

    @Override
    public void calculateArea() {
        int area = side * side;
        System.out.println ("Area of the Square is: " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 4 * side;
        System.out.println ("Perimeter of the Square is: " + perimeter);  
    }
}


     