package pack;

public class FindingReverse {
    int number;  // Instance variable to store the number

    // Constructor 1: Accepts a number to calculate the reverse
    public FindingReverse(int number) {
        this.number = number;  // Assign argument to instance variable
    }

    // Method to calculate and return the reversed number
    public int reverseNumber() {
        int t = number;  // Temporary variable to preserve the original number
        int reverse = 0;  // Store the reversed number

        while (t != 0) {
            int digit = t % 10;  // Extract the last digit
            reverse = reverse * 10 + digit;  // Append digit to reversed number
            t /= 10;  // Remove the last digit from t
        }
        return reverse;  // Return the reversed number
    }

    // Constructor 2: Displays the message and the reversed number
    public FindingReverse(int number, boolean display) {
        this.number = number;  // Assign argument to instance variable
        System.out.println("Finding reverse...");
        System.out.println("Reversed Number: " + reverseNumber());
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Invoke only the display constructor
        new FindingReverse(12345, true);  // Example: Reversing 12345
    }
}
