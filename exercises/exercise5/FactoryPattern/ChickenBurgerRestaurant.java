package exercises.exercise5.FactoryPattern;

public class ChickenBurgerRestaurant extends Restaurant {

  @Override
  public Burger createBurger() {
    System.out.println("Preparing Chicken Burger");
    return new ChickenBurger();
  }

}