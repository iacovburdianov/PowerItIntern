package TaskNo7Inheritance;

public class Room {
    private int roomNumber;
    private int floor;
    private Visitor occupant;

    public Room(int roomNumber, int floor) {
        this.roomNumber = roomNumber;
        this.floor = floor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public boolean isAvailable() {
        return occupant == null;
    }

    public Visitor getOccupant() {
        return occupant;
    }

    public void assignVisitor(Visitor visitor) {
        occupant = visitor;
    }

    public void removeOccupant() {
        occupant = null;
    }
}
