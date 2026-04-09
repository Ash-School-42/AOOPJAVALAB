/**
 * Name: James Ash
 * Date: 04-07-2026
 * Assignment: 1.5 Week 1 Project
 *
 * Purpose:
 * This class represents a phone number.
 * It is used inside the Contact class (Composition),
 * meaning a Contact object contains a PhoneNumber object.
 **/
class PhoneNumber {

    // Variable to store the phone number
    String number;

    // Constructor for PhoneNumber
    // Initializes the phone number value
    PhoneNumber(String number) {

        // Assign the phone number to the variable
        this.number = number;
    }
}