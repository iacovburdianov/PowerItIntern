package TaskNo7Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hotel {
    private List<Room> rooms;

    public Hotel(int numRooms) {
        rooms = new ArrayList<>(numRooms);
        for (int i = 1; i <= numRooms; i++) {
            int floor = (i - 1) / 10 + 1; // assuming 10 rooms per floor
            Room room = new Room(i, floor);
            rooms.add(room);
        }
    }

    public int getNumRooms() {
        return rooms.size();
    }

    public Room getRoom(int index) {
        return rooms.get(index);
    }

    public Room assignRandomAvailableRoom() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        if (availableRooms.isEmpty()) {
            return null;
        }
        Random random = new Random();
        return availableRooms.get(random.nextInt(availableRooms.size()));
    }
}
