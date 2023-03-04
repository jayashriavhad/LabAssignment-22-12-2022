package collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();//create the arraylist
		a.add("Bus"); // adding  the data  in list
	    a.add("van");
		a.add("XYZ");
		a.add("PQR");
	    a.add("STU");
	    a.add("STQ");
	    a.add("CST");
	    System.out.println(a);//print the data
	    
	    
	    // creat new arraylist. List is an inteface thats why cannot create the object in list
	    List l=new ArrayList();// create the list
	    l.add("JKL");//add the values in the list
	    l.add("GHJ");
	    System.out.println(l);//print the list
	    
	    l.addAll(a);//Adding the collection in the list
	    System.out.println(l);
	    
	    l.remove(2);//remove the element at index position 2
	    System.out.println(l);
	    
	    l.remove(3);//remove the element at index position 3
	    System.out.println(l);

        l.set(2,"QWE");//replacing the data at index number 1
	    System.out.println(l);//printing the arraylist
	    
	    l.add(2, "lms");//trying to add data at index number 2
	    System.out.println(l);
	   
	   
		ArrayList<Integer> a1=new ArrayList<Integer>();//create a arraylist
		a1.add(1); // adding  the data  in list
	    a1.add(2);
		a1.add(3);
		 System.out.println(a1);
		
	}

}


