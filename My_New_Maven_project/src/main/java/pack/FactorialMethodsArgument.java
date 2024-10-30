package pack;

public class FactorialMethodsArgument {
    
    // Method to calculate the factorial of a number
    public int calculate(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;  // Multiply each number up to 'number'
        }
        return factorial;  // Return the calculated factorial
    }

    // Method to print the factorial result
    public void print(int number) {
        System.out.println("Calculating factorial...");
        int result = calculate(number);  // Call the calculate method
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create an object of the Factorial class
    	FactorialMethodsArgument obj = new FactorialMethodsArgument();
        
        // Invoke only the print method, passing the number as an argument
        obj.print(5);  // Example: Factorial of 5
    }
}
