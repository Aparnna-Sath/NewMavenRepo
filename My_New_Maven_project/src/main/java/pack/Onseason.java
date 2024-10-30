package pack;

import java.util.Scanner;

public class Onseason extends Offseason {
	
	
	public double discount(double price) {
        double discountAmount = price * 0.15;  // 15% discount
        return price - discountAmount;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the clothing item: ");
        double price = scanner.nextDouble();
    	String season=scanner.nextLine(); 
        System.out.print("Is it 'onseason' or 'offseason'? ");
       season=scanner.nextLine(); 
       if(season.contentEquals("onseason"))
       {
    	   
    	 Onseason o =new Onseason();
    	 o.discount(price);
    	 System.out.println("The amount is"+o.discount(price));
       }
       else if(season.contentEquals("offseason"))
       {
    	   
    	   Offseason o =new Offseason();
    	   System.out.println("The amount is"+o.discount(price));
      	  
       }
    	   
      
        
        
        
	}

}
