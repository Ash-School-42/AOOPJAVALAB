/**
 * Name: James Ash
 * Date: 04-09-2026
 * Assignment: 1.5 Week 1 Project
 * 
 * This is the main program for the Rolodex Application.
 * It demonstrates how different contact types are created
 * and displayed using inheritance and composition.
 **/
public class App {
    public static void main(String[] args) {

        // Display Project Information
        System.out.println("\nJames Ash - Project Week 1 - Rolodex App\n");

        // Display Welcome Message / Instructions
        System.out.println("Welcome to your Rolodex!");
        System.out.println("This program shows a simple contact list.");

        // Create Contact Objects
        // These objects use child classes that inherit from Contact
        // Business contact (demonstrates inheritance)
        BusinessContact c1 = new BusinessContact(
                "Alice Johnson",
                "alice@email.com",
                "555-111-2222",
                "TechCorp"
        );

        // Family contact (demonstrates inheritance)
        FamilyContact c2 = new FamilyContact(
                "Bob Smith",
                "bob@email.com",
                "555-333-4444",
                "Brother"
        );

        // Display Contact Information
        // Calls the display() method from each object
        System.out.println("Contacts:\n");

        // Display business contact details
        c1.display();

        // Display family contact details
        c2.display();

        // End of Program
        System.out.println("End of contact list.");
    }
}
