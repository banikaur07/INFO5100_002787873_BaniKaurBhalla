package exercises.exercise0;

public class ExerciseZero {
    public static void main(String[] args) {
        // Three objects of class Animal
        Animal dogAnimalObj = new Animal("dog", "tuffy", "white", "large", "biscuits", false, true, 5);
        
        // nested class 1
        Animal.NestedDisplay dogNestedDisplay = dogAnimalObj.new NestedDisplay();
        dogNestedDisplay.printAll();

        // nested class 2
        Animal.NestedFood animalNestedFood = dogAnimalObj.new NestedFood();
        String food = animalNestedFood.getFood();
        System.out.println(food);

        Animal catAnimalObj = new Animal("cat", "linda", "black","medium", "catFood", false, true, 8);
        Animal birdAnimalObj = new Animal("bird", "paro", "green","small", "birdFood", true, false, 5);

        // Three objects of class Laptop
        Laptop dellLaptopObj = new Laptop("dell", 50 , "grey", "small", "intel", 200, 16, "large");
        Laptop macbookLaptopObj = new Laptop("macbook", 500 , "white", "large", "i5", 100, 18, "large");
        Laptop microsoftLaptopObj = new Laptop("microsoft", 70 , "pink", "small", "intel", 70, 16, "small");

        // Three objects of class Bottle
        Bottle miltonBottleObj = new Bottle("milton", "small" , "grey", "small", "medium", 500, "wide", "huge");
        Bottle celloBottleObj = new Bottle("cello", "large" , "black", "large", "medium", 200, "wide", "large");
        Bottle contigoBottleObj = new Bottle("contigo", "small" , "blue", "small", "medium", 300, "wide", "small");

        // Three objects of class Table
        Table woodenTableObj = new Table("a", 50 , 300, 20, 5, "light", "pink", "large");
        Table steelTableObj = new Table("b", 20 , 400, 10, 5, "light", "black", "small");
        Table plasticTableObj = new Table("c", 70 , 50, 10, 5, "light", "silver", "large");

        // Three objects of class Mobile
        Mobile appleMobileObj = new Mobile("large", "apple" , "grey", 900, "large", "small", "full", "large");
        Mobile samsungMobileObj = new Mobile("small", "samsung" , "black", 500, "small", "small", "full", "large");
        Mobile googleMobileObj = new Mobile("small", "google" , "white", 300, "small", "small", "full", "large");

        // Three objects of class Chair
        Chair steelChairObj = new Chair("abc", 20 , "small", "tall", "medium", "black", 2.75f, 100);
        Chair woodenChairObj = new Chair("xyz", 50 , "medium", "short", "medium", "pink", 2.75f, 200);
        Chair metalChairObj = new Chair("efg", 80 , "large", "tall", "medium", "white", 2.75f, 50);

        // Three objects of class TShirt
        Tshirt cropTshirtObj = new Tshirt("zara", 20 , "short", "over", "full", "black", "good", 200);
        Tshirt fullsleevesTshirtObj = new Tshirt("h&m", 20 , "short", "over", "full", "red", "good", 250);
        Tshirt longTshirtObj = new Tshirt("gap", 10 , "long", "over", "full", "pink", "good", 100);

        // Three objects of class Person
        Person aPersonObj = new Person("short", 10 , "underweight", "white", 20, "black", "female", "black");
        Person bPersonObj = new Person("tall", 50 , "overweight", "pale", 15, "black", "male", "black");
        Person cPersonObj = new Person("short", 20 , "overweight", "dark", 30, "blonde", "female", "brown");
    }
}