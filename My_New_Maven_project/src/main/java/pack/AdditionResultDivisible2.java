package pack;

import java.util.Scanner;


public class AdditionResultDivisible2 extends AdditionResultDivisible1 {
	
	  public void div(int a, int b)
	  {
		  int result = super.add(a,b);
	        System.out.println("Addition Result: " + result);
	        
	        // Check if the result is divisible by 10
	        if (result % 10 == 0) {
	            System.out.println("The result is divisible by 10.");
	        } else {
	            System.out.println("The result is not divisible by 10.");
	        }
	    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionResultDivisible2 obj = new AdditionResultDivisible2();
	        
	        // Test with sample numbers
	        obj.div(25, 35);  // Example: 25 + 35 = 60, divisible by 10
	        obj.div(10, 22);  // Example: 10 + 22 = 32, not divisible by 10
		

	}

}
