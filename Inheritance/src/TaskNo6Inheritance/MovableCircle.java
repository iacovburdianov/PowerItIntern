package TaskNo6Inheritance;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class MovableCircle implements Movable{
    @Override
    public void moveUp() {
        System.out.println("Circle moved up.");
    }

    @Override
    public void moveDown() {
        System.out.println("Circle moved down.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Circle moved left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Circle moved right.");
    }
}
