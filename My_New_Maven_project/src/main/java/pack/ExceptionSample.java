package pack;
import java.lang.*;
public class ExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=30;
		try
		{
			int c=100/0;
			System.out.println(c);	
		}
		catch (ArithmeticException e)
		{
		System.out.println("Exception Handled");	
		}
		int s=a+b;
		System.out.println(s);
		
	}

}
