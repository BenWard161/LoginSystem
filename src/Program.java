import java.util.Scanner;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> userLogins = new HashMap<String, String>();

        userLogins.put("Admin", "Password");
        userLogins.put("Admin1", "Password1");
        userLogins.put("Admin2", "Password2");

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter username: ");
        String inputUsername = reader.nextLine();
        System.out.println("Enter password: ");
        String inputPassword = reader.nextLine();

        try
        {
            if (userLogins.get(inputUsername).equals(inputPassword))
            {
                System.out.println("Welcome...");
            }
            else
            {
                throw new Exception("Login Error");
            }
        }
        catch (Exception e)
        {
            System.out.println("ACCESS DENIED");
        }
    }
}