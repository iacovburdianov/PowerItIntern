package TaskNo11Polymorphism.ex12;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woof");
    }
    void greets(Dog another) {
        System.out.println("Wooooof");
    }
}
