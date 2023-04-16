package TaskNo4Inheritance;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Dog extends Animal {
    public Dog(String food, String breed) {
        super(food, breed);
    }
    @Override
    public void makeNoise() {
        System.out.println("Ham Ham");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat " + getFood());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
