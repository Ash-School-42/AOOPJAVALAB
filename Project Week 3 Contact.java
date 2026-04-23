/**
 * Name: James Ash
 * Date: 04-21-2026
 * Assignment: 3.2 Week 3 Project
 * 
 * Abstract base class for all contacts
 **/

public abstract class Contact implements Displayable {

    // Private variables for contact info
    private String name;
    private PhoneNumber phoneNumber;

    // Default constructor
    public Contact() {
        name = "Unknown";
        phoneNumber = new PhoneNumber("000", "000-0000");
    }

    // Constructor with parameters
    public Contact(String name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for phone number
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}
