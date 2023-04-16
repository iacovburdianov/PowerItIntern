package TaskNo9Polymorphism;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.show();

        System.out.println("_____________________________________");

        Circle circle = new Circle();
        circle.show();

        circle.getInfo();
    }
}
