package pack;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int withdraw=1000;
		int balance=300;
		if (withdraw>balance)
		{
			try
			{
				throw new MyExceptionClass("insufficiant balance");
				
			}
			catch (Exception e)
			
			{
				System.out.println("Exception handled");
			}
		}
		
		
	}

}
