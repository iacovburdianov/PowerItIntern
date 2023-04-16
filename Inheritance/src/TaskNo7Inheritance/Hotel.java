package TaskNo7Inheritance;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Hotel {
    Visitor visitor;
    int roomNumber;
    Room room;

    Map<Integer,Boolean> rooms = new HashMap<>();
    public Hotel() {
        for (int i = 1; i <= 50; i++) {
            Integer key = i;
            Boolean value = false;
            rooms.put(key,value);
        }
    }





    public void occupyRoom(Visitor visitor) {
        roomNumber = getRandomNumber(1,50);
        rooms.replace(roomNumber,true,false);
    }

    public void freesRoom(Visitor visitor) {

    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
