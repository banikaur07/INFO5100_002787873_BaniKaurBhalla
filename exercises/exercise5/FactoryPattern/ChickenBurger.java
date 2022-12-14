package exercises.exercise5.FactoryPattern;

public class ChickenBurger implements Burger {

  @Override
  public void prepare() {
    // Prepares Chicken Burger 
    System.out.println("Preparing Chicken Burger");
  }

}