package pack;



public class Offseason {
	double discount_amount;
	double price;
	double final_price;
	
	public double  discount(double price)
	{
	        discount_amount = price * 0.40;  //40% discount
	        final_price = price - discount_amount;
	        return final_price;
	        		
	}

	
	public static void main(String[] args) {
	
		

	}

}
