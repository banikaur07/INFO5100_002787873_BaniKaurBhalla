package exercises.exercise5.AbstractFactory;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      
      Shape shape1 = shapeFactory.getShape("SimpleRECTANGLE");
      shape1.process();

      Shape shape2 = shapeFactory.getShape("SimpleSQUARE");
      shape2.process();

      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      
      Shape shape3 = shapeFactory1.getShape("SimpleRECTANGLE");
      shape3.process();
      
      Shape shape4 = shapeFactory1.getShape("SimpleSQUARE");
      shape4.process();
    }
 }