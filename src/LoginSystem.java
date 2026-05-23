import java.util.Scanner;

public class LoginSystem {
    
    public static boolean login() {
            Scanner keyboard = new Scanner(System.in); 
            System.out.println("--- Login System ---");
            System.out.print("Enter username: ");
            String user = keyboard.nextLine();

            System.out.print("Enter password: ");
            String pass = keyboard.nextLine();

            return user.equals("admin") && pass.equals("1234");
        }
    }