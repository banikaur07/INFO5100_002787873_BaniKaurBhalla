package exercises.exercise3b;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import exercises.exercise2.Circle;
import exercises.exercise2.*;


public class SerializationTest {
    public static void main(String[] args) {

        try {
            // Rectangle
            Rectangle rectangleObj = new Rectangle(10, 20);
            FileOutputStream rectangleFileOut = new FileOutputStream("rectangle.ser");
            ObjectOutputStream rectangleOut = new ObjectOutputStream(rectangleFileOut);
            rectangleOut.writeObject(rectangleObj);
            rectangleOut.close();
            rectangleFileOut.close();
            System.out.println("Serialized data will be saved in rectangle.ser");

            // Circle
            Circle circleObj = new Circle(20, 3);
            FileOutputStream circleFileOut = new FileOutputStream("circle.ser");
            ObjectOutputStream circleOut = new ObjectOutputStream(circleFileOut);
            circleOut.writeObject(circleObj);
            circleOut.close();
            circleOut.close();
            System.out.println("Serialized data will be saved in circle.ser");

            // Triangle
            Triangle triangleObj = new Triangle(15, 20, 10, 12);
            FileOutputStream triangleFileOut = new FileOutputStream("triangle.ser");
            ObjectOutputStream triangleOut = new ObjectOutputStream(triangleFileOut);
            triangleOut.writeObject(triangleObj);
            triangleOut.close();
            triangleOut.close();
            System.out.println("Serialized data will be saved in triangle.ser");

            // Square
            Square SquareObj = new Square(50);
            FileOutputStream SquareFileOut = new FileOutputStream("Square.ser");
            ObjectOutputStream SquareOut = new ObjectOutputStream(SquareFileOut);
            SquareOut.writeObject(SquareObj);
            SquareOut.close();
            SquareOut.close();
            System.out.println("Serialized data will be saved in Square.ser");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
