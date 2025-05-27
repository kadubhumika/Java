import java.util.Scanner;

public class GreetSomeone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read user input

        System.out.println("Hello, " + name + "! Have a great day!");  // Greet the user

        scanner.close();  // Close the scanner
    }
}
