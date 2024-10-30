package pack;

public class ThrowThrowSample {
	
	public void print02() throws ArithmeticException

	{
		print01();
		
	}
	
	public void print01() throws ArithmeticException
	{
		int c=100/0;
		System.out.println(c);
		throw new ArithmeticException();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowThrowSample cc=new ThrowThrowSample();
		try {
		cc.print02();
		}
		catch (ArithmeticException e) {
			System.out.println("Exception Handled");
		}
	}
	
	

}
