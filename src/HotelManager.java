public class HotelManager {
    private final Room[] rooms = new Room[50];
    private final Booking[] bookings = new Booking[100];

    private int roomCount = 0;
    private int bookingCount = 0;

    public void addRoom(Room room) {
        rooms[roomCount++] = room;
    }

    public void addBooking(Booking booking) {
        bookings[bookingCount++] = booking;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public Room getFirstAvailableRoom() {
    for (int i = 0; i < roomCount; i++) {
        if (!rooms[i].isBooked()) {
            return rooms[i];
        }
    }
    return null;
    }

    public void searchByGuest(String name) {
        for (int i = 0; i < bookingCount; i++) {
            if (bookings[i].getGuest().getName().equalsIgnoreCase(name)) {
                System.out.println(bookings[i]);
            }
        }
    }

    public void createBooking(Guest guest, Room room, double pricePerNight) {
        if (!room.isBooked()) {
        Booking booking = new Booking(guest, room, pricePerNight);
        booking.confirmBooking(pricePerNight);
        bookings[bookingCount++] = booking;
        } else {
            System.out.println("Error:Room is already booked.");
        }
    }

        public void updateNights(String guestName, int newNights) {
        for (int i = 0; i < bookingCount; i++) {
            if (bookings[i].getGuest().getName().equalsIgnoreCase(guestName)) {
                bookings[i].getGuest().setStayDuration(newNights);
            }
        }
    }

    public void displayBooking() {
        for (int i = 0; i < bookingCount; i++) {
            System.out.println(bookings[i]);
        }
    }
}
