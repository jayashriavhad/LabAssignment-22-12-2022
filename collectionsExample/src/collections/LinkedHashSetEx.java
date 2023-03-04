package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {


		LinkedHashSet s=new LinkedHashSet(); // create the LinkedHashSet
		s.add("priya");//add the element in the LinkedHashSet
		s.add("vaibhav");
		s.add("Shubhangi");
		s.add(11);
		s.add(20);
		System.out.println(s); //print the LinkedHashSet
		s.add(null);// adding the null value
		s.add(null);//only one null value can allow
		System.out.println(s);
		s.add("priya");//duplicates are not allowed
		System.out.println(s);
		
		

	}

}

