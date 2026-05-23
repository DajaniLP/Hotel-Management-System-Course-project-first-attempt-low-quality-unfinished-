public class Booking {
    private final Guest guest;
    private final Room room;
    private double pricePerNight;


    public Booking(Guest guest, Room room, double pricePerNight) {
        this.guest = guest;
        this.room = room;
        this.pricePerNight = pricePerNight;
    }

    public void confirmBooking(double pricePerNight) {
        room.bookRoom();
        calculateCost(pricePerNight);
    }

    public double calculateCost(double pricePerNight) {

        if (room.getType() == RoomType.SINGLE) {
            return pricePerNight * guest.getStayDuration();
        } if (room.getType() == RoomType.DOUBLE) {
            return ((pricePerNight * guest.getStayDuration()) * 2);
        } if (room.getType() == RoomType.SUITE) {
            return ((pricePerNight * guest.getStayDuration()) * 3);
        } 
    return pricePerNight;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public String toString() {
      return guest.getName() + " booked Room " + room.getType() +
               " | Total: " + calculateCost(pricePerNight);
    }

}
