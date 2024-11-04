import java.util.Scanner;

public class Module2 {
    // Data fields
    private Scanner sc;
    private String input;
    private String user;
    private String password;

    // Constructor method
    public Module2() {
        sc = new Scanner(System.in);  // Create the Scanner object for user input
        input = "";  // Initialize input as an empty string
        user = "";   // Initialize user as an empty string
        password = "";  // Initialize password as an empty string
    }

    // Main method
    public static void main(String[] args) {
        // Create a new Module2 object
        Module2 m = new Module2();
        
        // Begin account creation process
        System.out.println("testing account creation module");

        // Prompt for six-digit ID number
        System.out.println("Enter a six-digit ID number starting with '000': ");
        m.input = m.sc.next();  // Capture user input
        
        // Check if the ID is valid (length check)
        if (m.input.length() != 6) {
            System.out.println("Error: ID number must be exactly 6 digits long.");
            System.exit(0);  // Exit if the ID length is invalid
        }

        // Check if the ID starts with "000" and contains only digits
        if (!m.input.startsWith("000") || !m.input.matches("[0-9]+")) {
            System.out.println("Error: ID must start with '000' and contain only digits.");
            System.exit(0);  // Exit if the ID format is invalid
        }

        // If the ID is valid, store it in the user field
        m.user = m.input;

        // Prompt for the password
        System.out.println("Enter a password (at least 6 characters, cannot match the ID): ");
        m.sc.nextLine();  // Clear the scanner's input buffer
        m.input = m.sc.nextLine();  // Capture password input

        // Check if the password is at least 6 characters long and not the same as the user ID
        if (m.input.length() < 6) {
            System.out.println("Error: Password must be at least 6 characters long.");
            System.exit(0);  // Exit if the password is too short
        }
        if (m.input.equals(m.user)) {
            System.out.println("Error: Password cannot match the ID.");
            System.exit(0);  // Exit if the password matches the ID
        }

        // If the password is valid, store it in the password field
        m.password = m.input;

        // Confirm successful account creation
        System.out.println("Account successfully created!");
        System.out.println("Username (ID): " + m.user);
        System.out.println("Password: " + m.password);

        // End account creation process
        System.out.println("ending application test");
    }
}
