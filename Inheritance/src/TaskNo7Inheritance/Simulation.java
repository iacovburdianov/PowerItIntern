package TaskNo7Inheritance;

public class Simulation {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(50);

        // check-in 20 visitors
        for (int i = 1; i <= 20; i++) {
            Visitor visitor = new Visitor("Visitor " + i, "Address " + i, "Favorite Hotel " + i);
            Room room = hotel.assignRandomAvailableRoom();
            if (room == null) {
                System.out.println("No available rooms.");
                break;
            }
            room.assignVisitor(visitor);
            System.out.println("Visitor " + visitor.getName() + " checked in to room " + room.getRoomNumber());
        }

        // check-out visitors
        for (int i = 1; i <= 20; i++) {
            Room room = hotel.getRoom(i - 1);
            Visitor visitor = room.getOccupant();
            if (visitor != null) {
                System.out.println("Visitor " + visitor.getName() + " checked out from room " + room.getRoomNumber());
                room.removeOccupant();
            }
        }
    }
}
