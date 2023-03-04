package collections;

import java.util.HashMap;

public class HashMapEx1 {

	public static void main(String[] args) {

    HashMap<Integer, String> hs=new HashMap<Integer ,String>();// it create a hashmap
    hs.put(111, "java");//put the value in the hashmap
    hs.put(112, "oop");
    hs.put(113, "SQL");
    hs.put(114, "Advance Java");
    hs.put(115, "Networking");
    hs.put(116, "SQL");
    hs.put(114, "XYZ");
    System.out.println(hs);// print the hashmap
    
    
	}

}

