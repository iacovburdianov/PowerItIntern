package TaskNo11Polymorphism.ex12;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Woow");
    }
    public void greets(Dog another) {
        System.out.println("Wooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooow");
    }
}
