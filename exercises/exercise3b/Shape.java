package exercises.exercise3b;

import java.io.Serializable;

/*
 * Abstract Class Shape
 */
public abstract class Shape implements Serializable {
    public static String className = "Shape";

    /*
     * abstract method to calculate area
     */
    abstract public void calculateArea(); 

    /*
     * abstract method to calculate perimeter
     */
    abstract public void calculatePerimeter();

}








