package exercises.exercise5.FactoryPattern;

public class VegBurger implements Burger {

  @Override
  public void prepare() {
    // Prepares Veg Burger
    System.out.println("Preparing Veg Burger");
  }

}