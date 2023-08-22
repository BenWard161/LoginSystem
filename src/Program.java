import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter username: ");
        String inputUsername = reader.nextLine();
        System.out.println("Enter password: ");
        String inputPassword = reader.nextLine();


        if (inputUsername.equals("Admin") && inputPassword.equals("Password"))
        {
            System.out.println("Welcome...");
        }
        else
        {
            System.out.println("ACCESS DENIED");
        }
    }
}