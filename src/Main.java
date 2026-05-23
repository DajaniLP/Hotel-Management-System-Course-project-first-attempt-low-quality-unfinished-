import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        HotelManager manager = new HotelManager();

        if (!LoginSystem.login()) {
            System.out.println("Access denied");
            return;
        }

        System.out.println("Login successful");

                int choice;
                                              
            do { 
            
                System.out.println("\n--- Hotel Management System ---");
                System.out.println("Option 1: Add room");
                System.out.println("Option 2: Book room");
                System.out.println("Option 3: Find guest");
                System.out.println("Option 4: Update Booking");
                System.out.println("Option 5: Display Bookings");
                System.out.println("Option 0: Exit");

                choice = keyboard.nextInt();


            

            switch (choice) {

                case 1:
                    System.out.print("Enter room number: ");
                    int number = keyboard.nextInt();
                    keyboard.nextLine();

                    System.out.print("Enter type (SINGLE/DOUBLE/SUITE): ");
                    String type = keyboard.nextLine().toUpperCase();

                    Room room = new Room(number, RoomType.valueOf(type));
                    manager.addRoom(room);

                    System.out.println("Room added successfully.");
                    break;

                case 2:


                    if (room == null) {
                        System.out.println("No available rooms! Please add a room first.");
                        break;
                    }

                    keyboard.nextLine();

                    System.out.print("Enter guest name: ");
                    String name = keyboard.nextLine();
                    

                    System.out.print("Enter room number: ");
                    int roomNumber = keyboard.nextInt();

                    System.out.print("Enter duration of stay (in days): ");
                    int stayDuration = keyboard.nextInt();
                    keyboard.nextLine();

                    Guest guest = new Guest(name, stayDuration);
                    guest.setRoomNumber(roomNumber);

                    Booking booking = new Booking(guest, room1, 50);
                    booking.confirmBooking(50);

                    manager.addBooking(booking);
                    FileManager.saveBooking(booking.toString());

                    System.out.println("Booking successful!");
                    break;

                case 3:
                    keyboard.nextLine();
                    System.out.print("Enter name: ");
                    String searchName = keyboard.nextLine();
                    manager.searchByGuest(searchName);
                    break;

                case 4:
                    keyboard.nextLine();
                    System.out.print("Enter name: ");
                    String updateName = keyboard.nextLine();

                    System.out.print("New nights: ");
                    int nights = keyboard.nextInt();
                    keyboard.nextLine();

                    manager.updateNights(updateName, nights);
                    manager.searchByGuest(updateName);
                    break;

                case 5:
                    manager.displayBooking();
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option.");
            } } while (choice !=0);
    }
}
