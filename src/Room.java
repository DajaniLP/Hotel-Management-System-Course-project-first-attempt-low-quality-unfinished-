public class Room {

    private final  int roomNumber;
    private final RoomType type;
    private boolean isBooked;

    public Room(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isBooked = false;
    }

    public void bookRoom() {
        this.isBooked = true;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public RoomType getType() {
        return type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
