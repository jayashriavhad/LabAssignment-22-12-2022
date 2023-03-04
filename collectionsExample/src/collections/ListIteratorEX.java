package collections;

import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorEX 
{

	public static void main(String[] args)
	{
		LinkedList <String>l=new LinkedList<String>();//create a Linkedlist
	     l.add("jayashri");//add the data in linkedlist
	     l.add("Priti");
	     l.add("Pranjal");
	     l.add("pooja");
	     l.add("Arti");
	     System.out.println(l);//print the data 
	     
	     ListIterator <String> itr=l.listIterator();
	     while(itr.hasNext())
	     {
	    	 String s=(String)itr.next();
	    	 if(s.equals("jayashri"))//check the element is equal or not then element is equal the remove that element
	    	 {
	    		 itr.remove();
	    	 }
	    	 else if(s.equals("pooja"))
	    	 {
	    		 itr.set("Kaveri");//replace the value 
	    	 }
	    	 else if(s.equals("priti"))
	    	 {
	    		 itr.add("xyz"); //add the element
	    	 }
	     }
	     System.out.println(l);

	}

}

