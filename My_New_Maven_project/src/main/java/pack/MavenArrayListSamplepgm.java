 package pack;
 
 import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MavenArrayListSamplepgm {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> al=new ArrayList();
		al.add("Aparnna");
		al.add("Midhun");
		al.add("Midhun");
		al.add("Suhail");
		al.add("Komal");
		System.out.println(al);
		String h=al.get(2);
		boolean y=al.contains("Aparnna");
		System.out.println(h);
		System.out.println(y);
		int s3=al.size();
		String a2=al.remove(2);
		System.out.println(s3);
		System.out.println(al);
		
		
		
		//Two ways to retrive elements from an array list
		//1.Iterator
		//2.for each loop/advanced for loop
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//for(datatype variable name:array/array list)
		for(String a:al)
		{
			
			System.out.println(a);
		}
		
		int i[]= {12,34,76};
		for(int s:i)
		{
			
		System.out.println(s);	
		}
		HashSet <String> s=new HashSet();
		s.add("Devi");
		s.add("Reshma");
		s.add("Sreelakshmi");
		s.add("Jessin");
		s.add("Jessin");
		System.out.println(s);
		s.remove("Devi");
		System.out.println(s);
		Iterator<String> itr2=s.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		
		
		for(String p:s)
		{
			
			System.out.println(p);
		}
		
		
}
}
