public class Guest extends Person {

    private int roomNumber;
    private int stayDuration;

    public Guest(String name, int stayDuration) {
        super(name);
        this.stayDuration = stayDuration;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getStayDuration() {
        return stayDuration;
    }

    public void setStayDuration(int stayDuration) {
        this.stayDuration = stayDuration;
    }
}