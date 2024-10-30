package pack;

public class CheckPalindrome {

    // Method to check if a given string is a palindrome
    public boolean isPalindrome(String str) {
        
        int left = 0, right = str.length() - 1;

        // Check characters from both ends towards the center
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // If any mismatch occurs, it's not a palindrome
            }
            left++;
            right--;
        }
        return true;  // If no mismatches, it's a palindrome
    }

    // Method to print the result
    public void printResult(String str) {
        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
    	CheckPalindrome checker = new CheckPalindrome();

        // Test the program with the given examples
        checker.printResult("Java");
        checker.printResult("malayalam");
    }
}
