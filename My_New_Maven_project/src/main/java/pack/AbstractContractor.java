package pack;
import java.util.Scanner;

public class AbstractContractor extends AbstractEmployee
{
	int h;
	@Override
	
	public void CalculateSalary()
	{
		int Salary=500*h;
		System.out.println("Salary is :"+Salary);
		
	}
	
	public int hours()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter hours of work");
		
		h = scanner.nextInt();
		return h;
	}
	
	
	

	public static void main(String[] args) {
		AbstractContractor s=new AbstractContractor();
		s.hours();
		s.CalculateSalary();
		// TODO Auto-generated method stub

	}

}
