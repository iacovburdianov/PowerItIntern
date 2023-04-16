package TaskNo7Inheritance;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Book {

    Hotel hotel;
    public void checkIn(Visitor visitor) {
        hotel.occupyRoom(visitor);
    }

    public void checkOut(Visitor visitor) {
        hotel.freesRoom(visitor);
    }
}
