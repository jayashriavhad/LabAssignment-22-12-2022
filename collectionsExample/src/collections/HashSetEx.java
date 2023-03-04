package collections;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();// create the hashset
		hs.add("Abc");// add the values in hashset
		hs.add("BSC");
		hs.add("JKL");
		hs.add(100);//add for the first time
		hs.add(10);
		System.out.println(hs);
		hs.add(null);
		//hs.add(null);// only one null value can allow 
		System.out.println(hs.add(200));
		System.out.println(hs.add(100));//add the duplicate
		System.out.println(hs);
		



	}

}
