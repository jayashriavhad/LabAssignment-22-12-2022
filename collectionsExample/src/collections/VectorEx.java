package collections;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector v=new Vector();//create vector
		System.out.println(v.capacity());//checking the current capacity of vector
		v.addElement("jayashri");// add the element
		v.add('p');
		System.out.println(v);//print the vector
		for(int i=0;i<10;i++)
		{
			v.addElement(i);//add the values to the vector;
		}
		System.out.println(v);
		v.add("jhgjb");
		System.out.println(v);
		System.out.println(v.capacity());//checking the current capacity of vector
		v.add(2,"pravin");
		System.out.println(v);
		
	}

}
