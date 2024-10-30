package pack;

public class Bank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int withdraw=1000;
		int balance=300;
		if (withdraw>balance)
		{
			try
			{
				throw new MyExceptionClass1();
				
			}
			catch (Exception e)
			
			{
				System.out.println("Exception handled");
			}
		}
		
		
	}

}
