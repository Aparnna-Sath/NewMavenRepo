package pack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAssignment {

	public static void main(String[] args) {
		
		ArrayList <String> al=new ArrayList();
		al.add("Black");
		al.add("White");
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		System.out.println(al);
		String h=al.get(2);
		System.out.println(h);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		String a2=al.remove(2);
		System.out.println(al);
		
		boolean y=al.contains("Aparnna");

		if(y==true)
		{
			System.out.println("Element is present");
		}
		else
		{
		 System.out.println("Element not present");
		}
		
		// TODO Auto-generated method stub

	}

}
