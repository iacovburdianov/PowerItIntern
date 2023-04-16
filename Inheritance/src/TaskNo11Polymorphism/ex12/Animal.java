package TaskNo11Polymorphism.ex12;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    abstract void greets();
}
