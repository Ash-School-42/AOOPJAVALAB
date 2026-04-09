/**
 * Name: James Ash
 * Date: 04-07-2026
 * Assignment: 1.5 Week 1 Project
 *
 * This is the base class for all contacts in the Rolodex application.
 * It stores common information such as name, email, and phone number.
 * This class demonstrates Inheritance (other classes will extend this 
 * class) and Composition (it contains a PhoneNumber object)
 **/
class Contact {

    // Variables to store basic contact information
    String name;
    String email;

    // PhoneNumber object (Compostition: Contact "has a" PhoneNumber)
    PhoneNumber phone;

    // Constructor for Contact
    // Initializes the contact's basic information
    Contact(String name, String email, String phoneNumber) {

        // Assign values to variables
        this.name = name;
        this.email = email;

        // Create a PhoneNumber object (Compostition)
        this.phone = new PhoneNumber(phoneNumber);
    }

    // Display method
    // Prints the basic contact information
    // This method can be reused or extended by child classes
    void display() {

        // Display name
        System.out.println("Name: " + name);

        // Display email
        System.out.println("Email: " + email);

        // Display phone number from PhoneNumber object
        System.out.println("Phone: " + phone.number);
    }
}