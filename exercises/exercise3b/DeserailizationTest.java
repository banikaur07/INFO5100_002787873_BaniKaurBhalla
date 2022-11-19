package exercises.exercise3b;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserailizationTest {
    public static void main(String[] args) {
        try {
            // Rectangle
            FileInputStream rectangleFileIn = new FileInputStream("rectangle.ser");
            ObjectInputStream rectangleIn = new ObjectInputStream(rectangleFileIn);
            Rectangle rectangelObj = (Rectangle) rectangleIn.readObject();
            rectangleIn.close();
            rectangleFileIn.close();
            System.out.println("Deserialized Rectangle Obj: " + rectangelObj);
            rectangelObj.calculateArea();
            rectangelObj.calculatePerimeter();

            // Square
            FileInputStream squareFileIn = new FileInputStream("square.ser");
            ObjectInputStream squareIn = new ObjectInputStream(squareFileIn);
            Square squareObj = (Square) squareIn.readObject();
            squareIn.close();
            squareFileIn.close();
            System.out.println("Deserialized Square Obj: " + squareObj);
            squareObj.calculateArea();
            squareObj.calculatePerimeter();

            // Triangle
            FileInputStream triangleFileIn = new FileInputStream("triangle.ser");
            ObjectInputStream triangleIn = new ObjectInputStream(triangleFileIn);
            Triangle triangleObj = (Triangle) triangleIn.readObject();
            triangleIn.close();
            triangleFileIn.close();
            System.out.println("Deserialized Triangle Obj: " + triangleObj);
            triangleObj.calculateArea();
            triangleObj.calculatePerimeter();

            // Circle
            FileInputStream circleFileIn = new FileInputStream("circle.ser");
            ObjectInputStream circleIn = new ObjectInputStream(circleFileIn);
            Circle circleObj = (Circle) circleIn.readObject();
            circleIn.close();
            circleFileIn.close();
            System.out.println("Deserialized Circle Obj: " + circleObj);
            circleObj.calculateArea();
            circleObj.calculatePerimeter();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
