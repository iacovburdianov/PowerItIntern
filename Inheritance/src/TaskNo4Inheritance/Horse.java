package TaskNo4Inheritance;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Horse extends Animal{
    public Horse(String food, String breed) {
        super(food, breed);
    }
    @Override
    public void makeNoise() {
        System.out.println("Nihaha Nihaha");
    }
    @Override
    public void eat() {
        System.out.println("Horse eat " + getFood());
    }
}
