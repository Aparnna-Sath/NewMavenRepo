package pack;

public class MavenInheritanceChildclass extends MavenInheritance {
	String color="Black";
	public MavenInheritanceChildclass()
	{
		
		super();
		System.out.println("Cons-child");
	}
	
	public void run()
	{
	System.out.println("child-run");
	
	}
	
	public void display()
	{
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MavenInheritanceChildclass childObj = new MavenInheritanceChildclass();

	        // Call the overridden run method
	        childObj.run();

	        // Display color using display method
	        childObj.display();
	}

}
