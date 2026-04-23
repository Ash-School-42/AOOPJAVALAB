/**
 * Name: James Ash
 * Date: 04-21-2026
 * Assignment: 3.2 Week 3 Project
 * 
 * Represents a phone number
 **/

public class PhoneNumber {

    // Private variables for phone parts
    private String areaCode;
    private String number;

    // Constructor
    public PhoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    // Method to return full phone number
    public String getFullNumber() {
        return "(" + areaCode + ") " + number;
    }
}
