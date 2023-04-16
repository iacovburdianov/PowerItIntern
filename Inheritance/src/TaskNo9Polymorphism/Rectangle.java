package TaskNo9Polymorphism;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Rectangle extends Shape{
    @Override
    public void show() {
        int i,j;
        int rows = 5;
        int columns = 10;

        for(i = 1; i <= rows; i++) {
            for(j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
