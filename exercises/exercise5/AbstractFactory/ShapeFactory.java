package exercises.exercise5.AbstractFactory;

/**
 * 
 */
public class ShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("SimpleRECTANGLE")){
         return new Rectangle();         
      }else if(shapeType.equalsIgnoreCase("SimpleSQUARE")){
         return new Square();
      }	 
      return null;
   }
 }
 