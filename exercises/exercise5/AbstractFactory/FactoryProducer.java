package exercises.exercise5.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){   
        if(rounded){
           return new RoundShapeFactory();         
        }else{
           return new ShapeFactory();
        }
     }
 }
 