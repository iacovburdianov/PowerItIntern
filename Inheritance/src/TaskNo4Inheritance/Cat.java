package TaskNo4Inheritance;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Cat extends Animal{
    private String fur;
    private String race;

    public Cat(String food, String breed, String fur, String race) {
        super(food, breed);
        this.fur = fur;
        this.race = race;
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau Miau");
    }
    @Override
    public void eat() {
        System.out.println("Cat eat " + getFood());
    }
}
