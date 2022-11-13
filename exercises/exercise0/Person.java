package exercises.exercise0;

/* 
 * Class Person
 */
public class Person {
    private String height;
    private int size;
    private String weight;
    private String skinColor;
    private int age;
    private String hairColor;
    private String gender;
    private String eyeColor ;

    /*
     * Constructor
     */
    public Person(String height, int size, String weight, String skinColor, int age, String hairColor, String gender, String eyeColor){
        this.height = height; 
        this.size = size; 
        this.weight = weight;
        this.skinColor = skinColor;
        this.age = age; 
        this.hairColor = hairColor; 
        this.gender = gender;
        this.eyeColor = eyeColor; 

        System.out.println("size of this person is: " + size);
    }

    /*
     * Method to print Height
     */
    public void PrintHeight() {
        System.out.println("My height is: " + this.height);
    }

    /*
     * Method to print Gender
     */
    public void PrintGender() {
        System.out.println("My gender is: " + this.gender);
    }

    /*
     * Method to print Weight
     */
    public void PrintWeight() {
        System.out.println("My weight is: " + this.weight);
    }
}
