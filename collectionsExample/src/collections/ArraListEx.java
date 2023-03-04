package collections;
import java.util.ArrayList;
import java.util.Collection;
public class ArraListEx 
{
   public static void main (String args[])
   {
	   ArrayList a=new ArrayList();// create Arraylist
	   a.add("java"); // adding  the data  in Arraylist
	   a.add("python");
	   a.add("js");
	   a.add("Android");
	   a.add(85);
	   a.add(22);
	   System.out.println(a);// printing the arraylist
	   
	   a.remove(4);// remove  the data  in list
	   System.out.println(a);// printing the arraylist
	   
	  a.set(2, "xyz");  // by replacing the value at index number 2 
	  System.out.println(a);// printing the arraylist
	   
	   
   }
}