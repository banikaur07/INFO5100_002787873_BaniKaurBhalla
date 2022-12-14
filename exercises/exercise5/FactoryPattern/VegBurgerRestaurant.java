package exercises.exercise5.FactoryPattern;

public class VegBurgerRestaurant extends Restaurant {

  @Override
  public Burger createBurger() {
    System.out.println("Preparing Veg Burger");
    return new VegBurger();
  }

}