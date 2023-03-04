package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList(); //create a arraylist
		
		for(int i=1;i<10;i++) // add the element in the arraylist by using for loop
		{
			al.add(i);
		}
		System.out.println(al);//print th arraylist
		Iterator itr=al.iterator();// it is use the iterator by the visit the every element in the arraylist
		
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next(); 
			if(i%2==0)// check the number is even or not
			{
				System.out.println(i);
			}
			else
			{
				itr.remove();
			}
			
		 }
		System.out.println(al);
	}

}
