package collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumrationEx {

	public static void main(String[] args) 
	{
		Vector v=new Vector();// create vector
		System.out.println(v.capacity()); // we can check the capacity of the vector
		for(int i=0;i<10;i++)
		{
			v.addElement(i);//add the values to the vector
		}
		System.out.println(v);//print the vector
		
		Enumeration <Integer>e=v.elements();//it is simply convert  the integer
		
		while(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();
			if(i%2==0)// check the number is even or odd
			{
				System.out.println(i);// print the even number
			}
			else
			{
				//v.remove(i);//removing odd values
			}
		}
		
	}

}
