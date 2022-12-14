package exercises.exercise5.FactoryPattern;

public class Main {

  public static void main(String[] args) {

    Restaurant chickenRestaurant = new ChickenBurgerRestaurant();
    chickenRestaurant.orderBurger();

    System.out.println("");

    Restaurant vegRestaurant = new VegBurgerRestaurant();
    vegRestaurant.orderBurger();
  }
}