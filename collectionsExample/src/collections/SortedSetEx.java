package collections;

import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {

        TreeSet t=new TreeSet();//create the Treeset
        t.add("E");//add the values
        t.add("f");
        t.add("A");
        t.add("C");
        t.add("B");
        t.add("D");
        
        System.out.println(t);//print the values
        System.out.println(t.first());//  print first element
        System.out.println(t.last());//print last element
        System.out.println(t.headSet("C"));// print the next all element without given element
        System.out.println(t.tailSet("D"));//print the both side element 
        System.out.println(t.subSet("C", "f"));//print the C,D,E 

	}

}
