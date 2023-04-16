package TaskNo4Inheritance;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Animal {
    protected String food;
    protected String breed;

    public Animal(String food, String breed) {
        this.food = food;
        this.breed = breed;
    }

    public String getFood() {
        return food;
    }

    public String getBreed() {
        return breed;
    }

    public void makeNoise() {
        System.out.println("\"Dog barks\", \"Cat meows\", \"Horse neighs\"");
    }
    public void eat() {
        System.out.println("Food");
    }
    public void sleep() {
        System.out.println("Sleep");
    }
}
