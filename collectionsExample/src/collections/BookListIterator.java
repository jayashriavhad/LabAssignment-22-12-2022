package collections;
import java.util.ArrayList;
import java.util.ListIterator;

public class BookListIterator {

	public static void main(String[] args) {

     ArrayList a=new ArrayList();  // Create Arraylist
     a.add("JAVA");// Adding the data into Arraylist
     a.add("Python");
     a.add("c");
     a.add("C++");
     a.add("CSS");
     a.add("JS");
     a.add("CObol");
     a.add("R");
     a.add("SQL");
     a.add("Networking");
     
     ListIterator <String> itr=a.listIterator();//it is use the list iterator 
     while(itr.hasNext())
     {
    	 String s=(String)itr.next();
    	 if(s.equals("C++"))
    	 {
    		 itr.set("Cloud Computing");
    	 }
     }
     System.out.println(a);

	}

}
