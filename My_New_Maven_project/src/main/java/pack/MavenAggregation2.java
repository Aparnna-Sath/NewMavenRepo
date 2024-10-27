package pack;

public class MavenAggregation2 {
	String house;
    String street;
    String city;
    MavenAggregation1 student; 
    
    // Constructor for AggregationStudent2
    public MavenAggregation2(String House,String Street,String City,MavenAggregation1 student)
    {
    	this.house=House;
    	this.street=Street;
    	this .city=City;
    	this.student=student;
    	
    	
    }

 // Method to print student details
    public void print()
    {
    	System.out.println(house);
    	System.out.println(street);
    	System.out.println(city);
    	System.out.println(student.name);
    	System.out.println(student.rollNo);
    	
    
    }

public static void main(String[] args)
{
    // Creating an AggregationStudent object

	MavenAggregation1 s=new MavenAggregation1("Aparnna",21);
	
    // Creating an AggregationStudent2 object with aggregation
	MavenAggregation2 ss=new MavenAggregation2("Sopanam","Aiswarya","Kochi",s);
	

     // Printing details using both objects
    
	ss.print();
}
	
}
