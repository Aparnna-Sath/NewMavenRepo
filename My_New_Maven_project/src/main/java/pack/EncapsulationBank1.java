package pack;

import java.util.Scanner;

public class EncapsulationBank1 {

    // Private field to store the pin
    private int pin;
    // Method to set the pin from user input
    public void setDetails() {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object
        System.out.print("Please enter a valid pin: ");
        this.pin = scanner.nextInt();  // Store the input in the private 'pin' field
       
    }

    // Method to validate the pin against an array of valid pins
    public boolean getDetails() {
        // Array of valid PINs
         int[] validPins = {1001, 1234, 1212};

        // Check if the input pin matches any valid pin
        for (int validPin : validPins) {
            if (this.pin == validPin) {
                return true;  // Pin found, return true
            }
        }

        return false;  // Pin not found, return false
    }

    public static void main(String[] args) {
        // Create an instance of the class
        
    }
}
