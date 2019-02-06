/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String n = reader.nextLine();
        if (n.equalsIgnoreCase("Alice") || n.equalsIgnoreCase("Bob")) {
            System.out.println("Hello");
        }
    }
}
