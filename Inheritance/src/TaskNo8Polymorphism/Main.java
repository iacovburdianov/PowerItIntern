package TaskNo8Polymorphism;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Main {
    public static void main(String[] args) {
        JohnDoe johnDoe = new JohnDoe();
        Cow cow = new Cow();
        Fish fish = new Fish();
        Dog dog = new Dog();
        Whale whale = new Whale();
        System.out.println(johnDoe.check(cow));
        System.out.println(johnDoe.check(dog));
        System.out.println(johnDoe.check(whale));
        System.out.println(johnDoe.check(fish));
    }
}
