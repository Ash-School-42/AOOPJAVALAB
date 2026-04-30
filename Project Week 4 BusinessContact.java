/**
 * Name: James Ash
 * Date: 04-30-2026
 * Assignment: 4.2 Week 4 Project
 * 
 * Business contact class (inheritance example)
 **/
public class BusinessContact extends Contact {

    // Stores company name
    String company; 

    public BusinessContact(String name, String email, String phoneNumber, String company) {

        // Call parent constructor
        super(name, email, phoneNumber);

        // Set company name
        this.company = company; 
    }

    public void display() {

        // Display base contact info
        super.display(); 

        // Show contact type
        System.out.println("Type: Business");

        // Show company
        System.out.println("Company: " + company); 

        // Separator line
        System.out.println("---------------------"); 
    }
}
