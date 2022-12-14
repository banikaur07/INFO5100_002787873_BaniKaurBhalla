package exercises.exercise5.AbstractFactory;

public class RoundShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("SimpleRECTANGLE")){
         return new RoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("SimpleSQUARE")){
         return new RoundedSquare();
      }	 
      return null;
   }
 }