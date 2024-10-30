package pack;

public class EncapsulationSample2 {

public static void main(String[] args) {
        // Create an instance of the class
        EncapsulationSample1 obj = new EncapsulationSample1();

        // Set the values of 'a' and 'b' using the setter method
        obj.setDetails(5, 10);

        // Get the sum using the getter method and print it
        int sum = obj.getDetails();
        System.out.println("Sum: " + sum);  // Output: Sum: 15
    }
}
