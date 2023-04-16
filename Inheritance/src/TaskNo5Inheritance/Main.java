package TaskNo5Inheritance;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("carne de porc", "Romania"),
                            new Cat("carne de pui","Cehia"),
                            new Horse("iarba verde", "Grecia")};
        Veterinary veterinary = new Veterinary();
        veterinary.treatAnimal(animals);
    }
}
